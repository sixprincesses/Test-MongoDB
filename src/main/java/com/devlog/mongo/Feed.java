package com.devlog.mongo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "feed")
public class Feed {
    @Id
    private String id;

    private String content;

    public Feed(String content) {
        this.content = content;
    }
}
