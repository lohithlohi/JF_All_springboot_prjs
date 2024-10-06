package com.ust.book_auth_prj.repository;

import com.ust.book_auth_prj.dataModel.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, Long> {

}
