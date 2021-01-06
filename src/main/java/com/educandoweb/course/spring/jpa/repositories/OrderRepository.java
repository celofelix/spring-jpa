package com.educandoweb.course.spring.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.spring.jpa.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
