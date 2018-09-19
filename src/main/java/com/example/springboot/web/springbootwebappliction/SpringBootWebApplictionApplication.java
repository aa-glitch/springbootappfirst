package com.example.springboot.web.springbootwebappliction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.springboot.web.springbootwebappliction.controller")
public class SpringBootWebApplictionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplictionApplication.class, args);
	}
}
