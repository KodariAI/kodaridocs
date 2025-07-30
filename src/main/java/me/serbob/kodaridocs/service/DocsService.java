package me.serbob.kodaridocs.service;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.serbob.kodaridocs.dto.DocResponse;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Service
@RequiredArgsConstructor
public class DocsService {

    private final ResourceLoader resourceLoader;
    private final TokenCountService tokenCountService;

    private final Map<String, DocResponse> docsCache = new ConcurrentHashMap<>();

    private static final String DOCS_PATTERN = "classpath:docs/*.md";

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

                String docId = filename.substring(0, filename.lastIndexOf('.'));
                String content = new String(resource.getInputStream().readAllBytes(), StandardCharsets.UTF_8);

                long tokens = tokenCountService.countTokens(content);

                docsCache.put(docId, new DocResponse(content, tokens));
                log.info("Loaded doc: {} ({} chars, {} tokens)", docId, content.length(), tokens);
            }

            log.info("Loaded {} documentation files", docsCache.size());
        } catch (IOException e) {
            log.error("Failed to load documentation files", e);
        }
    }

    public List<String> getAvailableDocs() {
        return docsCache.keySet().stream()
                .sorted()
                .toList();
    }

    public DocResponse getDoc(String docId) {
        return docsCache.get(docId);
    }
}
