package com.dev4vn.first_springboot.repository;

import com.dev4vn.first_springboot.entity.Pets;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Pets,Long> {
}
