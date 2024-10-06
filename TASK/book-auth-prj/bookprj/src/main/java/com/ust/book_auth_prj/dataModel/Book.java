package com.ust.book_auth_prj.dataModel;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "book")
public class Book {

    @Id
    private Long id;
    private String title;
    private Long authorId;
}
