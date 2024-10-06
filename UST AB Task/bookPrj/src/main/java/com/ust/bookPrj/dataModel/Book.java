package com.ust.bookPrj.dataModel;

import lombok.Data;
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
