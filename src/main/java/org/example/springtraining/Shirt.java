package org.example.springtraining;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Shirt implements Outfit {
    @Override
    public void wear() {
        System.out.println("Đang mặc áo sơ mi");
    }
}