package com.nati.apii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@ComponentScan
@CrossOrigin
public class ApiiApplication {
	@Autowired
	private UserRepository userRepository;
	User user;
	public static void main(String[] args) {
		SpringApplication.run(ApiiApplication.class, args);
	}
	@GetMapping
	public String Print() {
		return "email: " ;
	}
}
