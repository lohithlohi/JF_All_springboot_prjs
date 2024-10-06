package com.ust.book_auth_prj.dataModel;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Author")
public class Author {

    @Id
    private Long id;
    private String name;

}
