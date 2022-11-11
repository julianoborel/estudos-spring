package com.juliano.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliano.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
