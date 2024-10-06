package com.ust.reciepie_project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reciepie {


    private int Id;

    private String name;
    private Set<String> ingredients;
    private String instructions;
    private String author;
    private String timetaken;
    private typeRecipie type;

}
