package com.ruv.phoneusagemonitor.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ruv.phoneusagemonitor.model.UserDetails;
import com.ruv.phoneusagemonitor.model.UserList;
import com.ruv.phoneusagemonitor.repos.UserRepo;

@RestController
public class UserDataController {

	@Autowired
	UserList ul;
	
	@Autowired
	UserRepo userRepo;
	
	@GetMapping("users")
	public UserList getUsers() {
		ul.setUserList(userRepo.findAll());
		return ul;
	}
	
	@PostMapping("users")
	public Optional<UserDetails> saveUser(@RequestBody UserDetails userDetails) {
		userRepo.save(userDetails);
		return userRepo.findById(userDetails.getUsername());
	}
	
	@PutMapping("users")
	public String saveOrUpdateUser(@RequestBody UserDetails userDetails) {
		userRepo.save(userDetails);
		return "{\"message\": \"Updated Successfully\"}";
	}
	
	@DeleteMapping("users/{username}")
	public String deleteUser(@PathVariable String username) {
		userRepo.deleteById(username);
		return "{\"message\": \"Deleted Successfully\"}";
	}
	
	@GetMapping("users/{username}")
	public Optional<UserDetails> getUser(@PathVariable String username) {
		return userRepo.findById(username);
	}

}
