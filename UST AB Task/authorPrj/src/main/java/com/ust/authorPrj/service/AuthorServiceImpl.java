package com.ust.authorPrj.service;

import com.ust.authorPrj.dataModel.Author;
import com.ust.authorPrj.exceptions.AuthorNotFoundException;
import com.ust.authorPrj.repository.AuthorRepository;
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
