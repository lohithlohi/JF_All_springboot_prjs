package com.ust.bookPrj.repository;

import com.ust.bookPrj.dataModel.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, Long> {

}
