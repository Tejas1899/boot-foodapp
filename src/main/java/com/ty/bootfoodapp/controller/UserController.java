package com.ty.bootfoodapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.bootfoodapp.dto.Login;
import com.ty.bootfoodapp.dto.User;
import com.ty.bootfoodapp.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;

	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	@GetMapping("/users")
	public List<User> getAllUser() {
		return service.getAllUser();
	}

	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}

	@DeleteMapping("/users")
	public String deleteUser(@RequestParam int id) {
		return service.deleteUser(id);
	}
	
	@PutMapping("/users")
	public User updateUser(@RequestParam int id,@RequestBody User user) {
		return service.updateUser(user, id);
	}
	
	@PostMapping("/users/login")
	public User validateUser(@RequestBody Login login) {
		return service.validateUser(login.getEmail(),login.getPassword());
	}
}
