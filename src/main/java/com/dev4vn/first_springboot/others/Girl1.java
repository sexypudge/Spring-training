package com.dev4vn.first_springboot.others;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Girl1 {
    @PostConstruct
    public void postConstruct(){
        System.out.println("Post girl");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Destroy girl");
    }
}
