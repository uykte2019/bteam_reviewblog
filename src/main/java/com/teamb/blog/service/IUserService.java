package com.teamb.blog.service;


import org.springframework.http.ResponseEntity;

import com.teamb.blog.model.User;

public interface IUserService {
	
	// add user
	public User registerUser(User user);
	
	//edit user
	public User updateUser(String username, User user);
	
	//delete user
	public Boolean deleteUser(String username);
	
	//get user
	public ResponseEntity<?> getUser(String username, User user);
}
