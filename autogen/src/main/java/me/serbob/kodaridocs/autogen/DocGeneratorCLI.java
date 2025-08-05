package me.serbob.kodaridocs.autogen;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DocGeneratorCLI {

    public static void main(String[] args) throws Exception {
        ApiDocGenerator generator = new ApiDocGenerator();

        Path inputDir = Paths.get("src/main/resources/input");
        Path outputDir = Paths.get("src/main/resources/output");

        Files.createDirectories(inputDir);
        Files.createDirectories(outputDir);

        long jarCount = Files.list(inputDir)
                .filter(p -> p.toString().endsWith(".jar"))
                .count();

        if (jarCount == 0) {
            System.out.println("No JAR files found in: " + inputDir.toAbsolutePath());
            System.out.println("Please add JAR files to scan!");
            return;
        }

        String mode = null;
        String packagePath = null;

        if (args.length > 0) {
            mode = args[0];
            if (args.length > 1) {
                packagePath = args[1];
            }
        }

        if (mode == null) {
            mode = System.getProperty("scan.mode", "full");
            packagePath = System.getProperty("scan.package");
        }

        if (mode.equalsIgnoreCase("package") || mode.equals("2")) {
            if (packagePath == null || packagePath.trim().isEmpty()) {
                System.err.println("Error: Package path is required for package-specific scan!");
                System.err.println("Usage: ./gradlew run --args=\"package me.serbob.kodaridocs.autogen.api\"");
                System.err.println("   or: ./gradlew run -Dscan.mode=package -Dscan.package=me.serbob.kodaridocs.autogen.api");
                return;
            }

            packagePath = packagePath.replace('/', '.');

            System.out.println("Mode: Package-specific scan");
            System.out.println("Package: " + packagePath);
            System.out.println();

            final String finalPackagePath = packagePath;
            Files.list(inputDir)
                    .filter(p -> p.toString().endsWith(".jar"))
                    .forEach(jarPath -> {
                        try {
                            System.out.println("Processing: " + jarPath.getFileName() + " (package: " + finalPackagePath + ")");
                            generator.generateDocs(
                                    jarPath.toString(),
                                    outputDir.toString(),
                                    finalPackagePath
                            );
                        } catch (Exception e) {
                            System.err.println("Failed to process: " + jarPath);
                            e.printStackTrace();
                        }
                    });
        } else {
            System.out.println("Mode: Full JAR scan");
            System.out.println();

            Files.list(inputDir)
                    .filter(p -> p.toString().endsWith(".jar"))
                    .forEach(jarPath -> {
                        try {
                            System.out.println("Processing: " + jarPath.getFileName() + " (full scan)");
                            generator.generateDocs(
                                    jarPath.toString(),
                                    outputDir.toString()
                            );
                        } catch (Exception e) {
                            System.err.println("Failed to process: " + jarPath);
                            e.printStackTrace();
                        }
                    });
        }

        System.out.println("\nDone! Check the output directory: " + outputDir.toAbsolutePath());

        if (args.length == 0 && System.getProperty("scan.mode") == null) {
            System.out.println("\n--- Usage Info ---");
            System.out.println("For full JAR scan:");
            System.out.println("  ./gradlew run");
            System.out.println("  ./gradlew run --args=\"full\"");
            System.out.println("");
            System.out.println("For package-specific scan:");
            System.out.println("  ./gradlew run --args=\"package me.serbob.kodaridocs.autogen.api\"");
            System.out.println("");
            System.out.println("Using system properties:");
            System.out.println("  ./gradlew run -Dscan.mode=full");
            System.out.println("  ./gradlew run -Dscan.mode=package -Dscan.package=me.serbob.kodaridocs.autogen.api");
        }
    }
}
