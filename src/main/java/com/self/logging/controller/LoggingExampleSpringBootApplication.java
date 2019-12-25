package com.self.logging.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.self.logging"})
public class LoggingExampleSpringBootApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(LoggingExampleSpringBootApplication.class, args);
	}

}
