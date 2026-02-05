package com.dev4vn.first_springboot;

import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class FirstSpringbootApplication {

	public static void main(String[] args) {
		 SpringApplication.run(FirstSpringbootApplication.class, args);

		}
	}


