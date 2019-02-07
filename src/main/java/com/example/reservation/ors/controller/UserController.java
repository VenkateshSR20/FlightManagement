package com.example.reservation.ors.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reservation.ors.model.UserEntity;
import com.example.reservation.ors.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userservice;
	
	@RequestMapping(value="")
	public Object getUsers() {
		
		return userservice.getUsers();
		
	}
	
	@PostMapping(value={"/create"})
	public void createUsers( @RequestBody UserEntity userEntity){
		
		userservice.createUsers(userEntity);
		
	}
}
