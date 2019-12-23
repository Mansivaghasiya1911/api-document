package com.github.liuanxin.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DocumentInfoAndUrlMap {

    private DocumentInfo documentInfo;
    private Map<String, DocumentUrl> documentMap;

    public void appendDocument(List<DocumentInfo> projects) {
        documentInfo.append(projects);
    }
}
