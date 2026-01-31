package com.dev4vn.first_springboot;

import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringbootApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(FirstSpringbootApplication.class, args);

		Girl girl = context.getBean(Girl.class);
		System.out.println("Girl instance"+girl);
		System.out.println("Girl outfit"+girl.outfit);
		girl.outfit.wear();

		MessageService email = new Email();
		Client client = new Client(email);
		client.processMessage("hello");
		}
	}


