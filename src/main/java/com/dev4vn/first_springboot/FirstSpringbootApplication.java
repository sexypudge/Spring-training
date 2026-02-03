package com.dev4vn.first_springboot;

import com.dev4vn.first_springboot.others.Girl1;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class FirstSpringbootApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(FirstSpringbootApplication.class, args);

		Girl girl = context.getBean(Girl.class);
		System.out.println("Girl instance"+girl);
		System.out.println("Girl outfit"+girl.outfit);
		girl.outfit.wear();

		Email email = context.getBean(Email.class);
		email.sendMessage("thanh dep zai");

		Client client = context.getBean(Client.class);
		client.processMessage("hello");

		Boy boy = context.getBean(Boy.class);
		System.out.println("boy"+boy);
		boy.useObjectMapper();

		Boy boy1 = context.getBean(Boy.class);
		System.out.println("boy"+boy1);

		Boy boy2 = context.getBean(Boy.class);
		System.out.println("boy"+boy2);

		Girl1 girl1 = context.getBean(Girl1.class);
		System.out.println("girl1 "+ girl1);

		Girl2 girl2 = context.getBean(Girl2.class);
		System.out.println("Girl2 "+ girl2);

		Boy1Service boy1Service= context.getBean(Boy1Service.class);
		Boy1 boy11 = boy1Service.getRandomBoy1();
		System.out.println(boy11);


		}
	}


