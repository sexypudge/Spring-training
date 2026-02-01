package com.dev4vn.first_springboot;

import org.springframework.stereotype.Component;

@Component
public class Email implements MessageService{
    @Override
    public void sendMessage(String m){
        System.out.println("Send email" + m);
    }
}
