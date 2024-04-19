package com.example.FipeRestAPI.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableMongoRepositories("com.example.FipeRestAPI.repository")
public class FipeRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FipeRestApiApplication.class, args);
	}

}
