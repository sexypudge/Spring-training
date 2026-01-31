package org.example.springtraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTrainingApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringTrainingApplication.class, args);

        Girl girl = context.getBean(Girl.class);

        System.out.println("Instance của Girl: " + girl);
        System.out.println("Outfit của Girl: " + girl.outfit);
        girl.show();
    }

}

