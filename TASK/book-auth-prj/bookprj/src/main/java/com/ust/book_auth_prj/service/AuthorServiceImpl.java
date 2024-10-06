package com.ust.book_auth_prj.service;

import com.ust.book_auth_prj.dataModel.Author;
import com.ust.book_auth_prj.exceptions.AuthorNotFoundException;
import com.ust.book_auth_prj.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> findAllAuthors() {
        return List.copyOf(authorRepository.findAll());
    }

    @Override
    public Author findByAuthorId(long id) {
        return authorRepository
                .findById(id)
                .orElseThrow(() -> new AuthorNotFoundException("Author already exists with id: " + id));
    }
}
