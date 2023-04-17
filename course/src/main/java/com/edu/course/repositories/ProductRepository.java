package com.edu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
    
}
