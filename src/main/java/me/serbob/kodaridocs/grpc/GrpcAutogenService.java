package me.serbob.kodaridocs.grpc;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.serbob.kodaridocs.autogen.ApiDocGenerator;
import me.serbob.kodaridocs.autogen.ScanMode;
import me.serbob.kodaridocs.proto.*;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Path;

/*
 * TODO
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class GrpcAutogenService extends JarDocGeneratorGrpc.JarDocGeneratorImplBase {

    private final ApiDocGenerator apiDocGenerator;

    @Override
    public void generateDocs(
            JarUploadRequest request,
            StreamObserver<JarDocsResponse> responseObserver
    ) {
        Path tempJar = null;
        Path tempOutput = null;

        try {
            tempJar = Files.createTempFile("upload-", "-" + sanitizeFileName(request.getFileName()));
            tempOutput = Files.createTempDirectory("docs-output-");

            Files.write(tempJar, request.getJarContent().toByteArray());

            ScanMode scanMode = request.getScanMode() == ScanModeProto.PACKAGE_SPECIFIC
                    ? ScanMode.PACKAGE_SPECIFIC
                    : ScanMode.FULL_JAR;

            String packagePath = request.hasPackagePath() ? request.getPackagePath() : null;

            apiDocGenerator.generateDocs(
                    tempJar.toString(),
                    tempOutput.toString(),
                    scanMode,
                    packagePath
            );

            String markdown = readGeneratedMarkdown(tempOutput);

            JarDocsResponse response = JarDocsResponse.newBuilder()
                    .setSuccess(true)
                    .setMarkdownContent(markdown)
                    .setClassesFound(countClassesInMarkdown(markdown))
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception e) {
            log.error("Failed to generate docs for JAR: {}", request.getFileName(), e);

            JarDocsResponse errorResponse = JarDocsResponse.newBuilder()
                    .setSuccess(false)
                    .setErrorMessage(e.getMessage())
                    .build();

            responseObserver.onNext(errorResponse);
            responseObserver.onCompleted();

        } finally {
            cleanup(tempJar, tempOutput);
        }
    }

    private String sanitizeFileName(String fileName) {
        return fileName.replaceAll("[^a-zA-Z0-9.-]", "_");
    }

    private String readGeneratedMarkdown(Path outputDir) throws Exception {
        return Files.list(outputDir)
                .filter(p -> p.toString().endsWith(".md"))
                .findFirst()
                .map(p -> {
                    try {
                        return Files.readString(p);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                })
                .orElse("# No documentation generated\n");
    }

    private int countClassesInMarkdown(String markdown) {
        return (int) markdown.lines()
                .filter(line -> line.startsWith("### Class:"))
                .count();
    }

    private void cleanup(Path tempJar, Path tempOutput) {
        try {
            if (tempJar != null) {
                Files.deleteIfExists(tempJar);
            }
            if (tempOutput != null) {
                Files.walk(tempOutput)
                        .sorted((a, b) -> -a.compareTo(b))
                        .forEach(p -> {
                            try {
                                Files.deleteIfExists(p);
                            } catch (Exception ignored) {}
                        });
            }
        } catch (Exception e) {
            log.warn("Cleanup failed", e);
        }
    }
}