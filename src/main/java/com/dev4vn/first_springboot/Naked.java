package com.dev4vn.first_springboot;

import org.springframework.stereotype.Component;

@Component
public class Naked implements Outfit{
    @Override
    public void wear(){
        System.out.println("wearing......");
    }
}
