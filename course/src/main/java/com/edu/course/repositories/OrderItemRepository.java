package com.edu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
    
}
