package com.ty.bootfoodapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.bootfoodapp.dto.User;
import com.ty.bootfoodapp.repository.UserRepository;

@Repository
public class UserDao {

	@Autowired
	UserRepository repository;

	public User saveUser(User user) {
		return repository.save(user);
	}

	public List<User> getAllUser() {
		return repository.findAll();
	}

	public User getUserById(int id) {
		Optional<User> optional = repository.findById(id);
		if (optional.isEmpty()) {
			return null;
		} else {
			return optional.get();
		}
	}

	public String deleteUser(int id) {
		Optional<User> optional = repository.findById(id);
		if (optional.isEmpty()) {
			return "User not found or deleted";
		} else {
			repository.delete(optional.get());
			return "User deleted";
		}
	}

	public User updateUser(User user, int id) {
		Optional<User> optional = repository.findById(id);
		if (optional.isEmpty()) {
			return null;
		} else {
			return repository.save(user);
		}
	}

	public User validateUser(String email, String password) {
		return repository.validateUser(email, password);

	}
}
