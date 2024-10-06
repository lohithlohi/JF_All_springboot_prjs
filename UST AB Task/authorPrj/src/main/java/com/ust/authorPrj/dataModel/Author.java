package com.ust.authorPrj.dataModel;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Author")
public class Author {

    public Author(long id, String name){
        this.id = id;
        this.name = name;
    }

    @Id
    private Long id;
    private String name;

}
