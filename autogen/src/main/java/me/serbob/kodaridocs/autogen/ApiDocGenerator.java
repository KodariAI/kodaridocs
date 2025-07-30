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
        log.info("Scanning JAR: {}", jarPath);


        File jarFile = new File(jarPath);
        String apiName = jarFile.getName().replace(".jar", "");

        Set<ClassInfo> allClasses = scanJarWithASM(jarFile);

        log.info("Found {} classes", allClasses.size());

        String markdown = buildMarkdown(apiName, allClasses);

        Path output = Paths.get(outputPath, apiName + ".md");
        Files.createDirectories(output.getParent());
        Files.writeString(output, markdown);

        log.info("Generated {} KB of docs", markdown.length() / 1024);
    }

    private Set<ClassInfo> scanJarWithASM(File jarFile) {
        Set<ClassInfo> classes = new HashSet<>();

        try (JarFile jar = new JarFile(jarFile)) {
            Enumeration<JarEntry> entries = jar.entries();

            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                String name = entry.getName();

                if (!name.endsWith(".class"))
                    continue;

                if (name.contains("$"))
                    continue;

                try (InputStream is = jar.getInputStream(entry)) {
                    ClassReader reader = new ClassReader(is);
                    ClassInfoVisitor visitor = new ClassInfoVisitor();
                    reader.accept(visitor, ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);

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

    private String buildMarkdown(String apiName, Set<ClassInfo> classes) {
        StringBuilder markdown = new StringBuilder();
        markdown.append("# ").append(apiName).append(" API Reference\n\n");

        if (classes.isEmpty()) {
            markdown.append("No public classes found in this JAR.\n");
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

    private String formatMethod(MethodInfo method) {
        StringBuilder sb = new StringBuilder();

        sb.append(typeToSimpleName(method.returnType));
        sb.append(" ");
        sb.append(method.name);
        sb.append("(");

        for (int i = 0; i < method.parameterTypes.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(typeToSimpleName(method.parameterTypes.get(i)));
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
            if ((access & Opcodes.ACC_PUBLIC) != 0 && !name.equals("<init>") && !name.equals("<clinit>")) {
                MethodInfo method = new MethodInfo();
                method.name = name;
                method.descriptor = descriptor;
                method.isStatic = (access & Opcodes.ACC_STATIC) != 0;

                Type methodType = Type.getMethodType(descriptor);
                method.returnType = methodType.getReturnType().getDescriptor();
                for (Type arg : methodType.getArgumentTypes()) {
                    method.parameterTypes.add(arg.getDescriptor());
                }

                if (exceptions != null) {
                    method.exceptions.addAll(Arrays.asList(exceptions));
                }

                info.methods.add(method);
            }
            return null;
        }
    }

    private static class ClassInfo {
        String name;
        String simpleName;
        String packageName;
        String superClass;
        List<String> interfaces = new ArrayList<>();
        List<MethodInfo> methods = new ArrayList<>();
        boolean isPublic;
        boolean isInterface;
        boolean isEnum;
        boolean isAbstract;
    }

    private static class MethodInfo {
        String name;
        String descriptor;
        String returnType;
        List<String> parameterTypes = new ArrayList<>();
        List<String> exceptions = new ArrayList<>();
        boolean isStatic;
    }
}
