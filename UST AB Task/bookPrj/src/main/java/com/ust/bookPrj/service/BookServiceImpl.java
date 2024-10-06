package com.ust.bookPrj.service;


import com.ust.bookPrj.dataModel.Book;
import com.ust.bookPrj.exceptions.BookNotFoundException;
import com.ust.bookPrj.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAllBooks() {
        return List.copyOf(bookRepository.findAll());
    }

    @Override
    public Book findBookById(long id) {
        return bookRepository
                .findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found od id: "+ id));
    }
}
