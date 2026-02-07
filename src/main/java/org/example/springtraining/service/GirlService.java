package org.example.springtraining.service;

import org.example.springtraining.domain.Girl;
import org.example.springtraining.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    public void createGirl(String name) {
        Girl girl = new Girl(name);
        girlRepository.save(girl); // Lưu vào database thenn
        System.out.println("Đã lưu cô gái: " + name);
    }
}