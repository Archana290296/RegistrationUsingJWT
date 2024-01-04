package com.registration.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registration.model.User;
import com.registration.service.UserService;

@RestController
@RequestMapping("/registration")
public class UserController {
	
	@Autowired
	private UserService serv;
	
	@PostMapping("/")
	public User registerUser(@RequestBody User user) {
		
		return this.serv.registerUser(user);
	}
	
	@GetMapping("/{username}")
	public  User getUser(@PathVariable("username") String username) {
		
		return this.serv.getUser(username);
	}
	
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Integer userId) {
		
		this.serv.deleteUser(userId);
	}

}
