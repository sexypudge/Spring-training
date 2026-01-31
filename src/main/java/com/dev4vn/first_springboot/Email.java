package com.dev4vn.first_springboot;

public class Email implements MessageService{
    @Override
    public void sendMessage(String m){
        System.out.println("Send email" + m);
    }
}
