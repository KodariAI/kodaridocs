package me.serbob.kodaridocs.autogen;

import lombok.extern.slf4j.Slf4j;
import org.reflections.Reflections;
import org.reflections.scanners.Scanners;
import org.reflections.util.ConfigurationBuilder;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.stream.Collectors;

/*
 * Not the best api doc generator, but it does show all the methods
 * so now the ai should stop hallucinating
 */
@Slf4j
public class ApiDocGenerator {

    public void generateDocs(String jarPath, String outputPath) throws Exception {
        log.info("Scanning JAR: {}", jarPath);

        File jarFile = new File(jarPath);
        String apiName = jarFile.getName().replace(".jar", "");

        URLClassLoader classLoader = new URLClassLoader(
                new URL[]{jarFile.toURI().toURL()},
                Thread.currentThread().getContextClassLoader()
        );

        Set<Class<?>> allClasses = loadClasses(jarFile, classLoader);

        allClasses = allClasses.stream()
                .filter(c -> Modifier.isPublic(c.getModifiers()))
                .filter(c -> !c.isAnonymousClass())
                .filter(c -> !c.isSynthetic())
                .filter(c -> !c.getName().contains("$"))
                .collect(Collectors.toSet());

        log.info("Found {} public classes", allClasses.size());

        String markdown = buildMarkdown(apiName, allClasses);

        Path output = Paths.get(outputPath, apiName + ".md");
        Files.createDirectories(output.getParent());
        Files.writeString(output, markdown);

        log.info("Generated {} KB of docs", markdown.length() / 1024);
    }

    private Set<Class<?>> loadClasses(File jarFile, URLClassLoader classLoader) {
        Set<Class<?>> classes = new HashSet<>();

        try {
            Reflections reflections = new Reflections(
                    new ConfigurationBuilder()
                            .setUrls(jarFile.toURI().toURL())
                            .addClassLoaders(classLoader)
                            .setScanners(Scanners.SubTypes, Scanners.TypesAnnotated)
                            .setExpandSuperTypes(true)
            );

            classes.addAll(reflections.getSubTypesOf(Object.class));
        } catch (Exception e) {
            log.warn("Reflections failed, trying manual scan");
        }

        if (classes.isEmpty())
            classes = manualScan(jarFile, classLoader);

        return classes;
    }

    private Set<Class<?>> manualScan(File jarFile, ClassLoader classLoader) {
        Set<Class<?>> classes = new HashSet<>();

        try (JarFile jar = new JarFile(jarFile)) {
            Enumeration<JarEntry> entries = jar.entries();

            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                String name = entry.getName();

                if (!name.endsWith(".class"))
                    continue;

                if (name.contains("$"))
                    continue;

                String className = name.replace('/', '.').replace(".class", "");

                try {
                    Class<?> clazz = Class.forName(className, false, classLoader);
                    classes.add(clazz);
                } catch (Exception e) {
                    log.debug("Could not load: {}", className);
                }
            }
        } catch (Exception e) {
            log.error("Manual scan failed", e);
        }

        return classes;
    }

    private String buildMarkdown(String apiName, Set<Class<?>> classes) {
        StringBuilder markdown = new StringBuilder();
        markdown.append("# ").append(apiName).append(" API Reference\n\n");

        if (classes.isEmpty()) {
            markdown.append("No public classes found in this JAR.\n");
            return markdown.toString();
        }

        Map<String, List<Class<?>>> packageGroups = classes.stream()
                .filter(c -> c.getPackage() != null)
                .collect(Collectors.groupingBy(
                        c -> c.getPackage().getName(),
                        TreeMap::new,
                        Collectors.toList()
                ));

        for (Map.Entry<String, List<Class<?>>> entry : packageGroups.entrySet()) {
            String packageName = entry.getKey();
            List<Class<?>> classList = entry.getValue();

            classList.sort((a, b) -> {
                if (a.isInterface() != b.isInterface())
                    return a.isInterface() ? -1 : 1;
                return a.getSimpleName().compareTo(b.getSimpleName());
            });

            markdown.append("## Package: ").append(packageName).append("\n\n");

            for (Class<?> clazz : classList) {
                appendClassDocs(clazz, markdown);
            }
        }

        return markdown.toString();
    }

    private void appendClassDocs(Class<?> clazz, StringBuilder markdown) {
        String type = getClassType(clazz);

        markdown.append("### Class: ").append(clazz.getName()).append("\n");
        markdown.append("Type: ").append(type).append("\n");

        if (clazz.getSuperclass() != null && !clazz.getSuperclass().equals(Object.class))
            markdown.append("Extends: ").append(clazz.getSuperclass().getName()).append("\n");

        Class<?>[] interfaces = clazz.getInterfaces();
        if (interfaces.length > 0) {
            markdown.append("Implements: ");
            for (int i = 0; i < interfaces.length; i++) {
                if (i > 0)
                    markdown.append(", ");
                markdown.append(interfaces[i].getName());
            }
            markdown.append("\n");
        }

        markdown.append("\n");

        List<Method> methods = Arrays.stream(clazz.getDeclaredMethods())
                .filter(m -> Modifier.isPublic(m.getModifiers()))
                .sorted(Comparator.comparing(Method::getName))
                .toList();

        if (methods.isEmpty()) {
            markdown.append("No public methods\n\n");
            return;
        }

        markdown.append("Methods:\n");

        Map<String, List<Method>> methodGroups = methods.stream()
                .collect(Collectors.groupingBy(Method::getName));

        for (Map.Entry<String, List<Method>> entry : methodGroups.entrySet()) {
            List<Method> overloads = entry.getValue();

            for (Method method : overloads) {
                markdown.append("- ").append(formatMethod(method)).append("\n");
            }
        }

        markdown.append("\n");
    }

    private String getClassType(Class<?> clazz) {
        if (clazz.isInterface())
            return "Interface";
        if (clazz.isEnum())
            return "Enum";
        if (Modifier.isAbstract(clazz.getModifiers()))
            return "Abstract Class";
        return "Class";
    }

    private String formatMethod(Method method) {
        StringBuilder sb = new StringBuilder();

        sb.append(method.getReturnType().getSimpleName());
        sb.append(" ");
        sb.append(method.getName());
        sb.append("(");

        Class<?>[] params = method.getParameterTypes();
        for (int i = 0; i < params.length; i++) {
            if (i > 0)
                sb.append(", ");
            sb.append(params[i].getSimpleName());
        }

        sb.append(")");

        Class<?>[] exceptions = method.getExceptionTypes();
        if (exceptions.length > 0) {
            sb.append(" throws ");
            for (int i = 0; i < exceptions.length; i++) {
                if (i > 0)
                    sb.append(", ");
                sb.append(exceptions[i].getSimpleName());
            }
        }

        return sb.toString();
    }
}
