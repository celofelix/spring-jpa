package com.educandoweb.course.spring.jpa.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.spring.jpa.entities.User;

@RestController
@RequestMapping(value = "users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u1 = new User(1L, "Marcelo", "marcelo@gmail.com", "964346405", "123456");
		return ResponseEntity.ok().body(u1);
	}

}
