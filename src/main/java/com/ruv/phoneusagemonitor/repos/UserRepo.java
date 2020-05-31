package com.ruv.phoneusagemonitor.repos;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ruv.phoneusagemonitor.model.UserDetails;

public interface UserRepo extends CrudRepository<UserDetails, String> {

	public List<UserDetails> findAll();
}
