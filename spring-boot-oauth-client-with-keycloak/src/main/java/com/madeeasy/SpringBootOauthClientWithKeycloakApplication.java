package com.madeeasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootOauthClientWithKeycloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOauthClientWithKeycloakApplication.class, args);
	}
	@GetMapping("/")
	public String index() {
		return "Hello World";
	}
	@GetMapping("/hello")
	public String hello() {
		return "Hello World again";
	}
}
