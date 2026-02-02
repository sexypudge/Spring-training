package org.example.springtraining.service;
import org.apache.commons.lang3.RandomStringUtils;
import org.example.springtraining.Girl;
import org.example.springtraining.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
    public Girl getRandomGirl(){
        String name = randomGirlName(10);

        // Gọi xuông tầng repository để query lấy một cô gái tên là "name" trong database
        return girlRepository.getGirlByName(name);

    }
    public String randomGirlName(int length) {
        // Random một string có độ dài quy định
        // Sử dụng thư viện Apache Common Lang
        return RandomStringUtils.randomAlphanumeric(length).toLowerCase();
    }

}
