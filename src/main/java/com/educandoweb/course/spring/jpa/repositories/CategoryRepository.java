package com.educandoweb.course.spring.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.spring.jpa.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
