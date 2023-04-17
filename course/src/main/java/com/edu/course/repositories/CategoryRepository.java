package com.edu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {
    
}
