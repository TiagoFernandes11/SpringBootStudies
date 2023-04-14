package com.edu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
