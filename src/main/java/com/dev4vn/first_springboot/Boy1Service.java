package com.dev4vn.first_springboot;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Boy1Service {
    @Autowired
    private Boy1Repository boy1Repository;

    public Boy1 getRandomBoy1(){
        String name = randomBoy1Name(10);
        return boy1Repository.getBoy1ByName(name);
    }

    public String randomBoy1Name(int length){
        return RandomStringUtils.randomAlphanumeric(length).toLowerCase();
    }
}
