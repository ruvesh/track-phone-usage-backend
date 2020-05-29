package com.ruv.phoneusagemonitor.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UsageData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String startTime;
	private String endTime;
	private String usageReason;
	
	@ManyToOne
	private User user;

	public UsageData() {
		super();
	}
	
	public UsageData(int id, String startTime, String endTime, String usageReason, User user) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.usageReason = usageReason;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	
	
	public String getUsageReason() {
		return usageReason;
	}

	public void setUsageReason(String usageReason) {
		this.usageReason = usageReason;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
