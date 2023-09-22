package com.MC1.UserServices.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.MC1.UserServices.Entities.User;
import com.MC1.UserServices.Exceptions.ResourceNotFoundException;
import com.MC1.UserServices.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public User saveUser(User user) {
//		when we want to get random id as string, used mainly for projects we are not using it as findById(String is not in JpaRepository) 
		 /* String randomUserId = UUID.randomUUID().toString();
		 * user.setUserID(randomUserId);
		 */		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		List<User> all = userRepository.findAll();
		return all;
	}


	@Override
	public User getUser(int id) {
		return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User with the given id is not present in server : " + id));
		
		ArrayList list = restTemplate.getForObject("url", ArrayList.class);
	}

}
