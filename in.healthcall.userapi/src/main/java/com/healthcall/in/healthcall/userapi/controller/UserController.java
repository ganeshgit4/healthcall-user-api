package com.healthcall.in.healthcall.userapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcall.in.healthcall.userapi.entity.User;
import com.healthcall.in.healthcall.userapi.service.UserService;

@RestController
@RequestMapping("/user/")
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("get")
	public List<User> getAll(){
		return userService.userList();
	}
	
	@PostMapping("post")
	public User insert(@RequestBody User user) {
		return userService.insert(user);
	}

}
