package com.dev4vn.first_springboot.controller;

import com.dev4vn.first_springboot.entity.Pets;
import com.dev4vn.first_springboot.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pets")
public class PetController {
    @Autowired
    private Repository repository;

    @PostMapping("/add")
    public Pets addPet(@RequestBody Pets pet) {
        return repository.save(pet);
    }
}
