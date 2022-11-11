package com.juliano.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliano.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
