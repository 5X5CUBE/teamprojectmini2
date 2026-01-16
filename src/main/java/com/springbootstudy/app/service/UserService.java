package com.springbootstudy.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springbootstudy.app.domain.Users;
import com.springbootstudy.app.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
		private PasswordEncoder passwordEncoder;
	
	public void addUser(Users user) {

		user.setPassword(passwordEncoder.encode(user.getPassword()));

		userMapper.addUser(user);
	
	}
}
