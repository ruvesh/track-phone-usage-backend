package com.ruv.phoneusagemonitor.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserList {

	private List<UserDetails> userList;

	public UserList() {
		super();
	}

	public UserList(List<UserDetails> userList) {
		super();
		this.userList = userList;
	}

	public List<UserDetails> getUserList() {
		return userList;
	}

	public void setUserList(List<UserDetails> userList) {
		this.userList = userList;
	}
	
	
}
