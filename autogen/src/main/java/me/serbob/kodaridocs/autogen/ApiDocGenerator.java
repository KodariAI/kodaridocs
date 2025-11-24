package me.serbob.kodaridocs.autogen;

import lombok.extern.slf4j.Slf4j;
import org.objectweb.asm.*;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Collectors;

@Slf4j
public class ApiDocGenerator {

    public void generateDocs(String jarPath, String outputPath) throws Exception {
        generateDocs(jarPath, outputPath, ScanMode.FULL_JAR, null);
    }

    public void generateDocs(String jarPath, String outputPath, String packagePath) throws Exception {
        generateDocs(jarPath, outputPath, ScanMode.PACKAGE_SPECIFIC, packagePath);
    }

    public void generateDocs(String jarPath, String outputPath, ScanMode mode, String packagePath) throws Exception {
        log.info("Scanning JAR: {} in {} mode", jarPath, mode);

        if (mode == ScanMode.PACKAGE_SPECIFIC) {
            log.info("Filtering to package: {}", packagePath);
        }

        File jarFile = new File(jarPath);
        String apiName = jarFile.getName().replace(".jar", "");

        if (mode == ScanMode.PACKAGE_SPECIFIC && packagePath != null) {
            String packageSuffix = packagePath.replace('/', '-').replace('.', '-');
            apiName = apiName + "-" + packageSuffix;
        }

        Set<ClassInfo> allClasses = scanJarWithASM(jarFile, mode, packagePath);

        log.info("Found {} classes", allClasses.size());

        String markdown = buildMarkdown(apiName, allClasses, mode, packagePath);

        Path output = Paths.get(outputPath, apiName + ".md");
        Files.createDirectories(output.getParent());
        Files.writeString(output, markdown);

        log.info("Generated {} KB of docs", markdown.length() / 1024);
    }

    private Set<ClassInfo> scanJarWithASM(File jarFile, ScanMode mode, String packagePath) {
        Set<ClassInfo> classes = new HashSet<>();

        String normalizedPackage = null;
        if (mode == ScanMode.PACKAGE_SPECIFIC && packagePath != null) {
            normalizedPackage = packagePath.replace('.', '/');
            if (!normalizedPackage.endsWith("/")) {
                normalizedPackage += "/";
            }
        }

        try (JarFile jar = new JarFile(jarFile)) {
            Enumeration<JarEntry> entries = jar.entries();

            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                String name = entry.getName();

                if (!name.endsWith(".class"))
                    continue;

                if (mode == ScanMode.PACKAGE_SPECIFIC && normalizedPackage != null) {
                    if (!name.startsWith(normalizedPackage)) {
                        continue;
                    }
                }

                try (InputStream is = jar.getInputStream(entry)) {
                    ClassReader reader = new ClassReader(is);
                    ClassInfoVisitor visitor = new ClassInfoVisitor();
                    reader.accept(visitor, 0);

                    if (visitor.info.isPublic) {
                        classes.add(visitor.info);
                    }
                } catch (Exception e) {
                    log.debug("Could not process: {} - {}", name, e.getMessage());
                }
            }
        } catch (Exception e) {
            log.error("Failed to scan JAR", e);
        }

        return classes;
    }

    private String buildMarkdown(String apiName, Set<ClassInfo> classes, ScanMode mode, String packagePath) {
        StringBuilder markdown = new StringBuilder();
        markdown.append("# ").append(apiName).append(" API Reference\n\n");

        if (mode == ScanMode.PACKAGE_SPECIFIC && packagePath != null) {
            markdown.append("**Package Filter:** `").append(packagePath).append("`\n\n");
        }

        if (classes.isEmpty()) {
            if (mode == ScanMode.PACKAGE_SPECIFIC) {
                markdown.append("No public classes found in package: ").append(packagePath).append("\n");
            } else {
                markdown.append("No public classes found in this JAR.\n");
            }
            return markdown.toString();
        }

        Map<String, List<ClassInfo>> packageGroups = classes.stream()
                .collect(Collectors.groupingBy(
                        c -> c.packageName,
                        TreeMap::new,
                        Collectors.toList()
                ));

        for (Map.Entry<String, List<ClassInfo>> entry : packageGroups.entrySet()) {
            String packageName = entry.getKey();
            List<ClassInfo> classList = entry.getValue();

            classList.sort((a, b) -> {
                if (a.isInterface != b.isInterface)
                    return a.isInterface ? -1 : 1;
                return a.simpleName.compareTo(b.simpleName);
            });

            markdown.append("## Package: ").append(packageName).append("\n\n");

            for (ClassInfo clazz : classList) {
                appendClassDocs(clazz, markdown);
            }
        }

        return markdown.toString();
    }

    private void appendClassDocs(ClassInfo clazz, StringBuilder markdown) {
        String type = getClassType(clazz);

        markdown.append("### Class: ").append(clazz.name).append("\n");
        markdown.append("Type: ").append(type).append("\n");

        if (clazz.superClass != null && !clazz.superClass.equals("java/lang/Object")) {
            markdown.append("Extends: ").append(clazz.superClass.replace('/', '.')).append("\n");
        }

        if (!clazz.interfaces.isEmpty()) {
            markdown.append("Implements: ");
            markdown.append(clazz.interfaces.stream()
                    .map(i -> i.replace('/', '.'))
                    .collect(Collectors.joining(", ")));
            markdown.append("\n");
        }

        markdown.append("\n");

        if (clazz.isEnum && !clazz.enumConstants.isEmpty()) {
            markdown.append("Enum Constants:\n");
            for (String constant : clazz.enumConstants) {
                markdown.append("- ").append(constant).append("\n");
            }
            markdown.append("\n");
        }

        List<MethodInfo> validConstructors = clazz.constructors.stream()
                .filter(this::hasValidParameterNames)
                .collect(Collectors.toList());

        if (!validConstructors.isEmpty()) {
            markdown.append("Constructors:\n");
            for (MethodInfo constructor : validConstructors) {
                markdown.append("- ").append(formatConstructor(constructor, clazz.simpleName)).append("\n");
            }
            markdown.append("\n");
        }

        if (clazz.methods.isEmpty()) {
            markdown.append("No public methods found\n\n");
            return;
        }

        markdown.append("Methods:\n");

        Map<String, List<MethodInfo>> methodGroups = clazz.methods.stream()
                .collect(Collectors.groupingBy(m -> m.name));

        for (Map.Entry<String, List<MethodInfo>> entry : methodGroups.entrySet()) {
            for (MethodInfo method : entry.getValue()) {
                markdown.append("- ").append(formatMethod(method)).append("\n");
            }
        }

        markdown.append("\n");
    }

    private String getClassType(ClassInfo clazz) {
        if (clazz.isInterface)
            return "Interface";
        if (clazz.isEnum)
            return "Enum";
        if (clazz.isAbstract)
            return "Abstract Class";
        return "Class";
    }

    private boolean hasValidParameterNames(MethodInfo method) {
        if (method.parameterNames.isEmpty()) return false;

        int validNames = 0;
        for (String name : method.parameterNames) {
            if (name != null && !isGeneratedParamName(name)) {
                validNames++;
            }
        }

        return validNames > 0;
    }

    private boolean isGeneratedParamName(String name) {
        if (name.startsWith("param") || name.startsWith("arg")) {
            String suffix = name.replaceFirst("^(param|arg)", "");
            if (suffix.matches("\\d+") ||
                    suffix.matches("[A-Z][a-z]+\\d*") ||
                    suffix.matches("[a-z]+\\d+")) {
                return true;
            }
        }
        return false;
    }

    private String formatConstructor(MethodInfo constructor, String className) {
        StringBuilder sb = new StringBuilder();

        sb.append(className);
        sb.append("(");

        for (int i = 0; i < constructor.parameterTypes.size(); i++) {
            if (i > 0) sb.append(", ");

            String paramType;
            if (i < constructor.parameterTypeSignatures.size() && constructor.parameterTypeSignatures.get(i) != null) {
                String paramSig = constructor.parameterTypeSignatures.get(i);
                if (paramSig.startsWith("L") || paramSig.startsWith("[")) {
                    paramType = simplifyGenericSignature(paramSig);
                } else {
                    paramType = typeToSimpleName(paramSig);
                }
            } else {
                paramType = typeToSimpleName(constructor.parameterTypes.get(i));
            }

            sb.append(paramType);

            if (i < constructor.parameterNames.size() && constructor.parameterNames.get(i) != null) {
                String paramName = constructor.parameterNames.get(i);
                if (!isGeneratedParamName(paramName)) {
                    sb.append(" ").append(paramName);
                }
            }
        }

        sb.append(")");

        if (!constructor.exceptions.isEmpty()) {
            sb.append(" throws ");
            sb.append(constructor.exceptions.stream()
                    .map(this::typeToSimpleName)
                    .collect(Collectors.joining(", ")));
        }

        return sb.toString();
    }

    private String formatMethod(MethodInfo method) {
        StringBuilder sb = new StringBuilder();

        if (method.isStatic) {
            sb.append("**static** ");
        }

        if (method.returnTypeSignature != null) {
            sb.append(simplifyGenericSignature(method.returnTypeSignature));
        } else {
            sb.append(typeToSimpleName(method.returnType));
        }

        sb.append(" ");
        sb.append(method.name);
        sb.append("(");

        boolean includeNames = hasValidParameterNames(method);

        for (int i = 0; i < method.parameterTypes.size(); i++) {
            if (i > 0) sb.append(", ");

            String paramType;
            if (i < method.parameterTypeSignatures.size() && method.parameterTypeSignatures.get(i) != null) {
                String paramSig = method.parameterTypeSignatures.get(i);
                if (paramSig.startsWith("L") || paramSig.startsWith("[")) {
                    paramType = simplifyGenericSignature(paramSig);
                } else {
                    paramType = typeToSimpleName(paramSig);
                }
            } else {
                paramType = typeToSimpleName(method.parameterTypes.get(i));
            }

            sb.append(paramType);

            if (includeNames && i < method.parameterNames.size() && method.parameterNames.get(i) != null) {
                String paramName = method.parameterNames.get(i);
                if (!isGeneratedParamName(paramName)) {
                    sb.append(" ").append(paramName);
                }
            }
        }

        sb.append(")");

        if (!method.exceptions.isEmpty()) {
            sb.append(" throws ");
            sb.append(method.exceptions.stream()
                    .map(this::typeToSimpleName)
                    .collect(Collectors.joining(", ")));
        }

        return sb.toString();
    }

    private String simplifyGenericSignature(String signature) {
        signature = signature.replace('/', '.');

        if (signature.startsWith("L") && signature.endsWith(";")) {
            signature = signature.substring(1, signature.length() - 1);
        }

        StringBuilder result = new StringBuilder();
        StringBuilder currentClass = new StringBuilder();
        int depth = 0;

        for (int i = 0; i < signature.length(); i++) {
            char c = signature.charAt(i);

            if (c == '<') {
                if (currentClass.length() > 0) {
                    result.append(getSimpleName(currentClass.toString()));
                    currentClass.setLength(0);
                }
                result.append('<');
                depth++;
            } else if (c == '>') {
                if (currentClass.length() > 0) {
                    result.append(getSimpleName(currentClass.toString()));
                    currentClass.setLength(0);
                }
                result.append('>');
                depth--;
            } else if (c == ';') {
                if (currentClass.length() > 0) {
                    result.append(getSimpleName(currentClass.toString()));
                    currentClass.setLength(0);
                }
                if (depth > 0 && i + 1 < signature.length() && signature.charAt(i + 1) != '>') {
                    result.append(", ");
                }
            } else if (c == ',') {
                if (currentClass.length() > 0) {
                    result.append(getSimpleName(currentClass.toString()));
                    currentClass.setLength(0);
                }
                result.append(", ");
            } else if (c == ' ') {
                if (result.length() > 0 && result.charAt(result.length() - 1) != ' ') {
                    result.append(' ');
                }
            } else {
                currentClass.append(c);
            }
        }

        if (currentClass.length() > 0) {
            result.append(getSimpleName(currentClass.toString()));
        }

        return result.toString();
    }

    private String getSimpleName(String fullName) {
        if (fullName.isEmpty()) return fullName;
        int lastDot = fullName.lastIndexOf('.');
        return lastDot >= 0 ? fullName.substring(lastDot + 1) : fullName;
    }

    private String typeToSimpleName(String type) {
        if (type.startsWith("[")) {
            return typeToSimpleName(type.substring(1)) + "[]";
        }

        switch (type) {
            case "Z": return "boolean";
            case "B": return "byte";
            case "C": return "char";
            case "S": return "short";
            case "I": return "int";
            case "J": return "long";
            case "F": return "float";
            case "D": return "double";
            case "V": return "void";
        }

        if (type.startsWith("L") && type.endsWith(";")) {
            type = type.substring(1, type.length() - 1);
        }

        type = type.replace('/', '.');
        return type.substring(type.lastIndexOf('.') + 1);
    }

    private static class ClassInfoVisitor extends ClassVisitor {
        private final ClassInfo info = new ClassInfo();

        public ClassInfoVisitor() {
            super(Opcodes.ASM9);
        }

        @Override
        public void visit(int version, int access, String name, String signature,
                          String superName, String[] interfaces) {
            info.name = name.replace('/', '.');
            info.simpleName = info.name.substring(info.name.lastIndexOf('.') + 1);
            info.packageName = info.name.contains(".") ?
                    info.name.substring(0, info.name.lastIndexOf('.')) : "";
            info.superClass = superName;
            info.interfaces.addAll(Arrays.asList(interfaces));
            info.isPublic = (access & Opcodes.ACC_PUBLIC) != 0;
            info.isInterface = (access & Opcodes.ACC_INTERFACE) != 0;
            info.isAbstract = (access & Opcodes.ACC_ABSTRACT) != 0;
            info.isEnum = (access & Opcodes.ACC_ENUM) != 0;
        }

        @Override
        public MethodVisitor visitMethod(int access, String name, String descriptor,
                                         String signature, String[] exceptions) {
            if ((access & Opcodes.ACC_PUBLIC) != 0) {
                if (name.equals("<init>")) {
                    MethodInfo constructor = new MethodInfo();
                    constructor.name = name;
                    constructor.descriptor = descriptor;
                    constructor.isStatic = false;

                    Type methodType = Type.getMethodType(descriptor);
                    for (Type arg : methodType.getArgumentTypes()) {
                        constructor.parameterTypes.add(arg.getDescriptor());
                    }

                    if (signature != null) {
                        parseMethodSignature(signature, constructor);
                    }

                    if (exceptions != null) {
                        constructor.exceptions.addAll(Arrays.asList(exceptions));
                    }

                    info.constructors.add(constructor);
                    return new ConstructorAnalyzer(constructor, info.fields);
                } else if (!name.equals("<clinit>")) {
                    MethodInfo method = new MethodInfo();
                    method.name = name;
                    method.descriptor = descriptor;
                    method.isStatic = (access & Opcodes.ACC_STATIC) != 0;

                    Type methodType = Type.getMethodType(descriptor);
                    method.returnType = methodType.getReturnType().getDescriptor();
                    for (Type arg : methodType.getArgumentTypes()) {
                        method.parameterTypes.add(arg.getDescriptor());
                    }

                    if (signature != null) {
                        parseMethodSignature(signature, method);
                    }

                    if (exceptions != null) {
                        method.exceptions.addAll(Arrays.asList(exceptions));
                    }

                    info.methods.add(method);
                    return new ParameterNameVisitor(method, method.isStatic);
                }
            }
            return null;
        }

        private void parseMethodSignature(String signature, MethodInfo method) {
            int returnTypeStart = signature.lastIndexOf(')') + 1;
            if (returnTypeStart > 0 && returnTypeStart < signature.length()) {
                method.returnTypeSignature = signature.substring(returnTypeStart);
            }

            int paramStart = signature.indexOf('(');
            int paramEnd = signature.indexOf(')');
            if (paramStart >= 0 && paramEnd > paramStart) {
                String params = signature.substring(paramStart + 1, paramEnd);
                parseParameterSignatures(params, method);
            }
        }

        private void parseParameterSignatures(String params, MethodInfo method) {
            int i = 0;
            while (i < params.length()) {
                char c = params.charAt(i);

                if (c == 'L') {
                    int end = i + 1;
                    int depth = 0;
                    while (end < params.length()) {
                        char ch = params.charAt(end);
                        if (ch == '<') depth++;
                        else if (ch == '>') depth--;
                        else if (ch == ';' && depth == 0) break;
                        end++;
                    }
                    method.parameterTypeSignatures.add(params.substring(i, end + 1));
                    i = end + 1;
                } else if (c == '[') {
                    int start = i;
                    i++;
                    while (i < params.length() && params.charAt(i) == '[') i++;

                    if (i < params.length()) {
                        char next = params.charAt(i);
                        if (next == 'L') {
                            int end = i + 1;
                            int depth = 0;
                            while (end < params.length()) {
                                char ch = params.charAt(end);
                                if (ch == '<') depth++;
                                else if (ch == '>') depth--;
                                else if (ch == ';' && depth == 0) break;
                                end++;
                            }
                            method.parameterTypeSignatures.add(params.substring(start, end + 1));
                            i = end + 1;
                        } else {
                            method.parameterTypeSignatures.add(params.substring(start, i + 1));
                            i++;
                        }
                    }
                } else {
                    method.parameterTypeSignatures.add(String.valueOf(c));
                    i++;
                }
            }
        }

        @Override
        public FieldVisitor visitField(int access, String name, String descriptor,
                                       String signature, Object value) {
            info.fields.put(name, descriptor);
            if (info.isEnum && (access & Opcodes.ACC_ENUM) != 0) {
                info.enumConstants.add(name);
            }
            return null;
        }
    }

    private static class ConstructorAnalyzer extends MethodVisitor {
        private final MethodInfo constructor;
        private final Map<String, String> classFields;
        private int lastLoadedVar = -1;
        private final Map<Integer, Integer> varIndexToParamIndex = new HashMap<>();

        public ConstructorAnalyzer(MethodInfo constructor, Map<String, String> classFields) {
            super(Opcodes.ASM9);
            this.constructor = constructor;
            this.classFields = classFields;

            int varIndex = 1;
            for (int i = 0; i < constructor.parameterTypes.size(); i++) {
                varIndexToParamIndex.put(varIndex, i);
                String type = constructor.parameterTypes.get(i);
                if (type.equals("J") || type.equals("D")) {
                    varIndex += 2;
                } else {
                    varIndex += 1;
                }
            }
        }

        @Override
        public void visitParameter(String name, int access) {
            constructor.parameterNames.add(name);
        }

        @Override
        public void visitLocalVariable(String name, String descriptor, String signature, Label start, Label end, int index) {
            if (index == 0) return;

            Integer paramIndex = varIndexToParamIndex.get(index);
            if (paramIndex != null) {
                while (constructor.parameterNames.size() <= paramIndex) {
                    constructor.parameterNames.add(null);
                }
                if (constructor.parameterNames.get(paramIndex) == null) {
                    constructor.parameterNames.set(paramIndex, name);
                }
            }
        }

        @Override
        public void visitVarInsn(int opcode, int var) {
            if (opcode == Opcodes.ALOAD || opcode == Opcodes.ILOAD ||
                    opcode == Opcodes.LLOAD || opcode == Opcodes.FLOAD ||
                    opcode == Opcodes.DLOAD) {
                if (var > 0 && varIndexToParamIndex.containsKey(var)) {
                    lastLoadedVar = var;
                }
            }
        }

        @Override
        public void visitFieldInsn(int opcode, String owner, String name, String descriptor) {
            if (opcode == Opcodes.PUTFIELD && classFields.containsKey(name)) {
                if (lastLoadedVar > 0 && varIndexToParamIndex.containsKey(lastLoadedVar)) {
                    int paramIndex = varIndexToParamIndex.get(lastLoadedVar);

                    while (constructor.parameterNames.size() <= paramIndex) {
                        constructor.parameterNames.add(null);
                    }
                    if (constructor.parameterNames.get(paramIndex) == null) {
                        constructor.parameterNames.set(paramIndex, name);
                    }
                }
                lastLoadedVar = -1;
            }
        }
    }

    private static class ParameterNameVisitor extends MethodVisitor {
        private final MethodInfo method;
        private final boolean isStatic;

        public ParameterNameVisitor(MethodInfo method, boolean isStatic) {
            super(Opcodes.ASM9);
            this.method = method;
            this.isStatic = isStatic;
        }

        @Override
        public void visitParameter(String name, int access) {
            method.parameterNames.add(name);
        }

        @Override
        public void visitLocalVariable(String name, String descriptor, String signature, Label start, Label end, int index) {
            int paramIndex = isStatic ? index : index - 1;

            if (paramIndex >= 0 && paramIndex < method.parameterTypes.size()) {
                while (method.parameterNames.size() <= paramIndex) {
                    method.parameterNames.add(null);
                }
                if (method.parameterNames.get(paramIndex) == null) {
                    method.parameterNames.set(paramIndex, name);
                }
            }
        }
    }

    private static class ClassInfo {
        String name;
        String simpleName;
        String packageName;
        String superClass;
        List<String> interfaces = new ArrayList<>();
        List<MethodInfo> methods = new ArrayList<>();
        List<MethodInfo> constructors = new ArrayList<>();
        List<String> enumConstants = new ArrayList<>();
        Map<String, String> fields = new HashMap<>();
        boolean isPublic;
        boolean isInterface;
        boolean isEnum;
        boolean isAbstract;
    }

    private static class MethodInfo {
        String name;
        String descriptor;
        String returnType;
        String returnTypeSignature;
        List<String> parameterTypes = new ArrayList<>();
        List<String> parameterTypeSignatures = new ArrayList<>();
        List<String> parameterNames = new ArrayList<>();
        List<String> exceptions = new ArrayList<>();
        boolean isStatic;
    }
}