package com.dev4vn.first_springboot;

public class Client {
    private MessageService messageService;
    public Client(MessageService mess){
        this.messageService = mess;
    }
    public void processMessage(String m){
        messageService.sendMessage(m);
    }
}
