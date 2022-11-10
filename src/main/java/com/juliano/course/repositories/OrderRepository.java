package com.juliano.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliano.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
