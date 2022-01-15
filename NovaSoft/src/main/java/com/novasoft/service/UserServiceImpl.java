package com.novasoft.service;

import java.util.List;

import com.novasoft.entity.User;

public interface UserServiceImpl {

	public void addUser(User user);
	
	public void deleteUserById(Long userId);
	
	public User getUserById(Long userId);
	
	public List<User> getAllUsers();
	
}
