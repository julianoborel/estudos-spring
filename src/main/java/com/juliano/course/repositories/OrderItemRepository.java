package com.juliano.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliano.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
