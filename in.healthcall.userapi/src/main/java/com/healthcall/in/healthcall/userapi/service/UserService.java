package com.healthcall.in.healthcall.userapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.healthcall.in.healthcall.userapi.entity.User;
import com.healthcall.in.healthcall.userapi.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	 public List<User> userList(){
		
		 return userRepository.findAll();
		
	}
	 public User insert(@RequestBody User user) {
		 return userRepository.save(user);
	 }
}
	 
