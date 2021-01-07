package com.educandoweb.course.spring.jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.spring.jpa.entities.Category;
import com.educandoweb.course.spring.jpa.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> category = categoryRepository.findById(id);
		return category.get();
	}
	
	
}
