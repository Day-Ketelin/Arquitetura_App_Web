package com.example.ClimaRestAPI.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableMongoRepositories("com.example.ClimaRestAPI.repository")
public class ClimaRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClimaRestApiApplication.class, args);
	}

}
