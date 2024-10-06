package com.ust.bookPrj.feign_clients;

import com.ust.bookPrj.dto.Author;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Author-service", url = "http://localhost:8200/api/v1/doctors")
public interface AuthorServiceClient {

    // GET /api/v1/doctor/{id}
    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable String id);
}
