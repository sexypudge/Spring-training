package org.example.springtraining;

import org.example.springtraining.service.GirlService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTrainingApplication { // Thêm dòng này

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringTrainingApplication.class, args);
        GirlService girlService = context.getBean(GirlService.class);

        // Thử thêm 1 cô gái vào DB thenn
        girlService.createGirl("thenn");
    }
} // Thêm dấu đóng ngoặc này