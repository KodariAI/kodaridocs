package me.serbob.kodaridocs.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.serbob.kodaridocs.dto.DocResponse;
import me.serbob.kodaridocs.proto.DocList;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class DocsService {

    private final ResourceLoader resourceLoader;
    private final TokenCountService tokenCountService;

    private final Map<String, DocResponse> docsCache = new ConcurrentHashMap<>();
    private final Map<String, Set<String>> categoryCache = new ConcurrentHashMap<>();

    private static final String DOCS_PATTERN = "classpath:docs/**/*.md";

    @PostConstruct
    public void loadDocs() {
        try {
            Resource[] resources = ResourcePatternUtils
                    .getResourcePatternResolver(resourceLoader)
                    .getResources(DOCS_PATTERN);

            for (Resource resource : resources) {
                if (!resource.exists() || !resource.isReadable())
                    continue;

                String filename = resource.getFilename();
                if (filename == null)
                    continue;

                String uri = resource.getURI().toString();

                String relativePath = extractRelativePath(uri);
                if (relativePath == null)
                    continue;

                String content = new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
                long tokens = tokenCountService.countTokens(content);

                String docPath = relativePath.substring(0, relativePath.lastIndexOf('.'));

                docPath = cleanPath(docPath);

                docsCache.put(docPath, new DocResponse(content, tokens));

                updateCategoryCache(docPath);

                log.info("Loaded doc: {} ({} chars, {} tokens)", docPath, content.length(), tokens);
            }
        } catch (IOException e) {
            log.error("Failed to load documentation files", e);
        }
    }

    private String extractRelativePath(
            String uri
    ) {
        String path = uri;

        if (path.startsWith("jar:")) {
            int exclamation = path.indexOf("!/");
            if (exclamation != -1)
                path = path.substring(exclamation + 2);
        }

        if (path.startsWith("file:"))
            path = path.substring(5);

        int docsIndex = path.indexOf("docs/");
        if (docsIndex == -1)
            return null;


        return path.substring(docsIndex + 5);
    }

    private String cleanPath(
            String path
    ) {
        return path
                .replace("build/resources/main/docs/", "");
    }

    private void updateCategoryCache(
            String docPath
    ) {
        String[] parts = docPath.split("/");

        if (parts.length > 1) {
            String category = String.join("/", Arrays.copyOf(parts, parts.length - 1));
            String docName = parts[parts.length - 1];

            categoryCache.computeIfAbsent(category, _ -> new TreeSet<>()).add(docName);
            return;
        }

        categoryCache.computeIfAbsent("", _ -> new TreeSet<>()).add(docPath);
    }

    public DocResponse getDoc(
            String category,
            String docId
    ) {
        String fullPath = normalizePath(category) + "/" + docId;
        return docsCache.get(fullPath);
    }

    public Map<String, DocList> getCategoryTreeProto() {
        return categoryCache.entrySet().stream()
                .filter(entry -> !entry.getKey().isEmpty())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> DocList.newBuilder()
                                .addAllDocId(entry.getValue())
                                .build()
                ));
    }

    private String normalizePath(
            String path
    ) {
        if (path == null)
            return "";

        return path
                .replaceAll("^/+|/+$", "")
                .replace("\\", "/");
    }
}
