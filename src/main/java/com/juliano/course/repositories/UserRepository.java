package com.juliano.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juliano.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
