package com.ooad.hungrybellies.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ooad.hungrybellies.entities.User;

import com.ooad.hungrybellies.repositories.UserRepository;

@Service
public class UserDAO {
	
	@Autowired
	UserRepository userRepository;
	
	/*to save an User*/
	
	public User save(User usr) {
		return userRepository.save(usr);
	}
	
	
	/* search all Users*/
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
	
	
	/*get an employee by id*/
	public User findOne(Long userId) {
		return userRepository.findOne(userId);
	}
	
	
	/*delete an employee*/
	
	public void delete(User usr) {
		userRepository.delete(usr);
	}
	

}
