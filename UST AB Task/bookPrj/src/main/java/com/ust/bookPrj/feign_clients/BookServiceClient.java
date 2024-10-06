package com.ust.bookPrj.feign_clients;

import com.ust.bookPrj.dto.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "book-service", url = "http://localhost:8100/api/v1/patients")
public interface BookServiceClient {

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable long id);

}
