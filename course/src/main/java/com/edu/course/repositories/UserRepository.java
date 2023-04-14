package com.edu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.course.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
