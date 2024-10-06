package com.ust.book_auth_prj.service;

import com.ust.book_auth_prj.dataModel.Book;
import com.ust.book_auth_prj.exceptions.BookNotFoundException;
import com.ust.book_auth_prj.repository.BookRepository;
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
