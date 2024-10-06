package com.ust.book_auth_prj.service;

import com.ust.book_auth_prj.dataModel.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    List<Author> findAllAuthors();

    Author findByAuthorId(long id);
}
