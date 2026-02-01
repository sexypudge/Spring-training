package com.dev4vn.first_springboot;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class Boy {

    @Autowired
    private ObjectMapper objectMapper;

    public void useObjectMapper(){
        System.out.println("ObjectMapper: "+objectMapper);
    }

}
