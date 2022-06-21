package com.ty.bootfoodapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.bootfoodapp.dao.UserDao;
import com.ty.bootfoodapp.dto.User;

@Service
public class UserService {

	@Autowired
	UserDao dao;

	public User saveUser(User user) {
		return dao.saveUser(user);
	}

	public List<User> getAllUser() {
		return dao.getAllUser();
	}

	public User getUserById(int id) {
		return dao.getUserById(id);
	}

	public String deleteUser(int id) {
		return dao.deleteUser(id);
	}

	public User updateUser(User user, int id) {
		return dao.updateUser(user, id);
	}

	public User validateUser(String email, String password) {
		return dao.validateUser(email, password);

	}

}
