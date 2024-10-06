package com.ust.authorPrj.service;


import com.ust.authorPrj.dataModel.Author;

import java.util.List;

public interface AuthorService {

    List<Author> findAllAuthors();

    Author findByAuthorId(long id);
}
