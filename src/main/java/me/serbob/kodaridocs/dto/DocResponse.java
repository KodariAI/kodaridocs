package me.serbob.kodaridocs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocResponse {
    private String content;
    private long tokens;
}
