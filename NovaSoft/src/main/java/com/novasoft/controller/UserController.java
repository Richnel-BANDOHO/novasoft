package com.novasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.novasoft.entity.User;
import com.novasoft.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String index() {
		
		return "Hello";
	}
	
	@PostMapping("/addUser")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);	
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public void deleteUser(@RequestParam Long userId) {
		userService.deleteUserById(userId);
	}
	
	@GetMapping("/getUser")
	public User getUser(@RequestParam Long userId) {
		return userService.getUserById(userId);
		
	}
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	

}
