package com.educandoweb.course.spring.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.spring.jpa.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
