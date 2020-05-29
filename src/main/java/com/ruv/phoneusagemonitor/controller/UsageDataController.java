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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruv.phoneusagemonitor.model.UsageData;

import com.ruv.phoneusagemonitor.model.User;
import com.ruv.phoneusagemonitor.repos.UsageDataRepo;

@RestController
public class UsageDataController {

	@Autowired
	UsageDataRepo usageDataRepo;
	
	@GetMapping("/users/{username}/usage")
	public List<UsageData> usageUser(@PathVariable String username) {
		return usageDataRepo.findUsageDataByUserUsername(username);
	}
	
	@PostMapping("/users/{username}/usage")
	public String addUsage(@RequestBody UsageData ud, @PathVariable String username) {
		
		ud.setUser(new User(username, ""));
		usageDataRepo.save(ud);
		return "{\"message\" : \"Added Successfully\" }";
	}
	
	@PutMapping("/users/{username}/usage")
	public String saveOrUpdateUsage(@PathVariable String username, @RequestBody UsageData ud) {
		ud.setUser(new User(username, ""));
		usageDataRepo.save(ud);
		return "{\"message\" : \"Updated Successfully\" }";
	}
	
	@DeleteMapping("/users/{username}/usage/{usageid}")
	public String deleteUsage(@PathVariable int usageid) {
		usageDataRepo.deleteById(usageid);
		return "{\"message\" : \"Deleted Successfully\" }";
	}
	
	@GetMapping("/users/{username}/usage/{usageid}")
	public Optional<UsageData> getUsageData(@PathVariable int usageid) {
		return usageDataRepo.findById(usageid);
	}
}
