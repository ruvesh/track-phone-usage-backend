package com.ruv.phoneusagemonitor.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ruv.phoneusagemonitor.model.User;

@RepositoryRestResource(collectionResourceRel = "users", path= "users")
public interface UserRepo extends JpaRepository<User, String> {

}
