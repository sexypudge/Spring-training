package org.example.springtraining.config;

import org.example.springtraining.domain.TodoValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoConfig {

    @Bean
    public TodoValidator validator() {
        return new TodoValidator();
    }
}
