package org.example.springtraining.repository;

import org.example.springtraining.Girl;

public interface GirlRepository {
    Girl getGirlByName(String name);
}
