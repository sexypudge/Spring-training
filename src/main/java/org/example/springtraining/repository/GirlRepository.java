package org.example.springtraining.repository;

import org.example.springtraining.domain.Girl;
import org.springframework.stereotype.Repository;


public interface GirlRepository {

    Girl getGirlByName(String name);
}
