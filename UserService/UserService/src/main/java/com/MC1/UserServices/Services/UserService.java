package com.MC1.UserServices.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.MC1.UserServices.Entities.User;

@Service
public interface UserService {

	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(int userId);
	
}
