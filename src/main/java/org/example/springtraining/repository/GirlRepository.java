package org.example.springtraining.repository;

import org.example.springtraining.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GirlRepository extends JpaRepository<Girl, Long> {

}