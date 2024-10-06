package com.ust.book_auth_prj.controller;

import com.ust.book_auth_prj.dataModel.Author;
import com.ust.book_auth_prj.dataModel.Book;
import com.ust.book_auth_prj.service.AuthorService;
import com.ust.book_auth_prj.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class AuthorController {

    private final AuthorService authorService;
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/allauthors")
    public ResponseEntity<List<Author>> getAllAuthors(){
        return ResponseEntity.ok(authorService.findAllAuthors());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Author> getBookByID(@PathVariable long id){
        return ResponseEntity.ok(authorService.findByAuthorId(id));
    }

}
