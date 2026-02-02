package org.example.springtraining.repository.impl;

import org.example.springtraining.Girl;
import org.example.springtraining.repository.GirlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class GirlRepositoryImpl implements GirlRepository {
    @Override
    public Girl getGirlByName(String name) {
        return new Girl(name);
    }
}
