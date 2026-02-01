package org.example.springtraining.repository.impl;

import org.example.springtraining.domain.Girl;
import org.example.springtraining.repository.GirlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class GirlRepositoryImpl implements GirlRepository {
    @Override
    public Girl getGirlByName(String name) {

        //  ví dụ là database đã trả về
        return new Girl(name);
    }
}
