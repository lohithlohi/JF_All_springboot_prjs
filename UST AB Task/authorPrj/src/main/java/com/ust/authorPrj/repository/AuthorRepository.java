package com.ust.authorPrj.repository;


import com.ust.authorPrj.dataModel.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface AuthorRepository extends MongoRepository<Author, Long> {

}
