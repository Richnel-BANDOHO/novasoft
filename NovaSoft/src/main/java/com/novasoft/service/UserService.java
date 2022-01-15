package com.novasoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novasoft.entity.User;
import com.novasoft.repository.UserRepository;

@Service
public class UserService implements UserServiceImpl{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void addUser(User user) {
			userRepository.save(user);
	}

	@Override
	public void deleteUserById(Long userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public User getUserById(Long userId) {
		return userRepository
				.findById(userId)
				.get();
	}

	@Override
	public List<User> getAllUsers() {
		
		return (List<User>) userRepository.findAll();
	}
	
}
