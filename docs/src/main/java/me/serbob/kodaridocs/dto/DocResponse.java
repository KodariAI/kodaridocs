package me.serbob.kodaridocs.dto;

public record DocResponse(
        String content,
        long tokens
) {}
