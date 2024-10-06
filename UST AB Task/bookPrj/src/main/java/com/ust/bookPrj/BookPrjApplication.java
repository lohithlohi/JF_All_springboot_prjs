package com.ust.bookPrj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // Enable Feign client
@EnableDiscoveryClient
public class BookPrjApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookPrjApplication.class, args);
	}

}
