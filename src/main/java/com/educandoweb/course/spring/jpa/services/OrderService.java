package com.educandoweb.course.spring.jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.spring.jpa.entities.Order;
import com.educandoweb.course.spring.jpa.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;
	
	
	public List<Order> findAll() {
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> user = orderRepository.findById(id);
		return user.get();
	}
	
	
}
