package com.example.wordmainapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WordMainApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WordMainApiApplication.class, args);
	}

}
