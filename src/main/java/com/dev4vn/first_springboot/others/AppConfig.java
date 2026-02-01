package com.dev4vn.first_springboot.others;

import com.dev4vn.first_springboot.Boy;
import com.dev4vn.first_springboot.Girl2;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    public Boy boy() {
        return new Boy();
    }
    @Bean
    public Girl2 girl2(){
        return new Girl2();
    }
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
