package com.nati.apii;

import org.h2.mvstore.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@ComponentScan
@CrossOrigin
public class ApiiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiiApplication.class, args);
	}

}
