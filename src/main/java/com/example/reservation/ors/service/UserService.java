package com.example.reservation.ors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reservation.ors.model.UserEntity;
import com.example.reservation.ors.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	public List<UserEntity> getUsers(){
		
		return userRepository.findAll();
		
	}
	
	public void createUsers(UserEntity userEntity) {
		userRepository.save(userEntity);
	}
}
