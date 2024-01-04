package com.registration.service;

import java.util.List;

import com.registration.model.User;

public interface UserService {
	
	public User registerUser(User user);
	
	public User getUser(String username);
	
	public void deleteUser(Integer userId);

}
