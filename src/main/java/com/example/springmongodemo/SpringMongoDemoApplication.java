package com.example.springmongodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SpringMongoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDemoApplication.class, args);
	}

}
