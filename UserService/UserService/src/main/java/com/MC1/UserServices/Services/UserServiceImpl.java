package com.MC1.UserServices.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.MC1.UserServices.Entities.User;
import com.MC1.UserServices.Exceptions.ResourceNotFoundException;
import com.MC1.UserServices.Repository.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(int id) {
		return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User ith the given id is not present in server : " + id));
	}

}
