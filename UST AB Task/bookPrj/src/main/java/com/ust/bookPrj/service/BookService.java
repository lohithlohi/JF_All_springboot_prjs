package com.ust.bookPrj.service;


import com.ust.bookPrj.dataModel.Book;

import java.util.List;

public interface BookService {

     List<Book> findAllBooks();

    Book findBookById(long id);
}
