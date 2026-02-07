package org.example.springtraining.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "girl")
@Data // Tự động tạo getter, setter, toString (Lombok)
public class Girl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Primary Key

    private String name;

    public Girl(String name) {
        this.name = name;
    }
}