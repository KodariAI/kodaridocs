package me.serbob.kodaridocs.controller;

import lombok.RequiredArgsConstructor;
import me.serbob.kodaridocs.annotations.ApiV1Controller;
import me.serbob.kodaridocs.dto.DocResponse;
import me.serbob.kodaridocs.service.DocsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@ApiV1Controller
@RequiredArgsConstructor
public class DocsController {

    private final DocsService docsService;

    @GetMapping("/available-docs")
    public List<String> getAvailableDocs() {
        return docsService.getAvailableDocs();
    }

    @GetMapping("/docs/{docId}")
    public ResponseEntity<DocResponse> getDoc(@PathVariable String docId) {
        DocResponse doc = docsService.getDoc(docId);

        if (doc == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(doc);
    }
}
