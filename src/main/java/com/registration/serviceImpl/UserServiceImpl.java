package com.registration.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registration.model.User;
import com.registration.repository.UserRepository;
import com.registration.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository repo;

	@Override
	public User registerUser(User user) {
		
		return repo.save(user);
	}

	@Override
	public User getUser(String username) {
		
		return repo.findByUsername(username);
	}

	@Override
	public void deleteUser(Integer userId) {
		
		repo.deleteById(userId);
	}

}
