package com.ruv.phoneusagemonitor.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UsageData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dateOfUsage;
	private String startTime;
	private String endTime;
	private String usageReason;
	
	@ManyToOne
	private UserDetails user;

	public UsageData() {
		super();
	}
	
	public UsageData(int id,  String dateofUsage, String startTime, String endTime, String usageReason, UserDetails user) {
		super();
		this.id = id;
		this.dateOfUsage = dateofUsage;
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

	
	
	public String getDateOfUsage() {
		return dateOfUsage;
	}

	public void setDateOfUsage(String dateOfUsage) {
		this.dateOfUsage = dateOfUsage;
	}

	public String getUsageReason() {
		return usageReason;
	}

	public void setUsageReason(String usageReason) {
		this.usageReason = usageReason;
	}

	public UserDetails getUser() {
		return user;
	}

	public void setUser(UserDetails user) {
		this.user = user;
	}
	
	
}
