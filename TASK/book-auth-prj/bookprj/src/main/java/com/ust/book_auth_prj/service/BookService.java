package com.ust.book_auth_prj.service;

import com.ust.book_auth_prj.dataModel.Book;

import java.util.List;

public interface BookService {

     List<Book> findAllBooks();

    Book findBookById(long id);
}
