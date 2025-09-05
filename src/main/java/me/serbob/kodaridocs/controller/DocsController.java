package me.serbob.kodaridocs.controller;

import lombok.RequiredArgsConstructor;
import me.serbob.kodaridocs.annotations.ApiV1Controller;
import me.serbob.kodaridocs.dto.DocResponse;
import me.serbob.kodaridocs.service.DocsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

@ApiV1Controller
@RequiredArgsConstructor
public class DocsController {

    private final DocsService docsService;

    @GetMapping("/docs/tree")
    public Map<String, List<String>> getCategoryTree() {
        return docsService.getCategoryTree();
    }

    @GetMapping("/docs/{category}/{subcategory}/{docId}")
    public ResponseEntity<DocResponse> getDocInformation(
            @PathVariable String category,
            @PathVariable String subcategory,
            @PathVariable String docId
    ) {
        String fullCategory = category + "/" + subcategory;
        DocResponse doc = docsService.getDoc(fullCategory, docId);

        if (doc == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(doc);
    }
}
