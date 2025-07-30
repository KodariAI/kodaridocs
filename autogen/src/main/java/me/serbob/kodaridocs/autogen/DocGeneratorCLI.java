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

        Files.list(inputDir)
                .filter(p -> p.toString().endsWith(".jar"))
                .forEach(jarPath -> {
                    try {
                        System.out.println("Processing: " + jarPath.getFileName());
                        generator.generateDocs(
                                jarPath.toString(),
                                outputDir.toString()
                        );
                    } catch (Exception e) {
                        System.err.println("Failed to process: " + jarPath);
                        e.printStackTrace();
                    }
                });

        System.out.println("\nDone! Check the output directory: " + outputDir.toAbsolutePath());
    }
}
