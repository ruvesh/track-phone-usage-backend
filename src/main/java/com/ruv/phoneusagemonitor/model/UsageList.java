package com.ruv.phoneusagemonitor.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UsageList {

	private List<UsageData> usageList;

	public UsageList() {
		super();
	}

	public UsageList(List<UsageData> usageList) {
		super();
		this.usageList = usageList;
	}

	public List<UsageData> getUsageList() {
		return usageList;
	}

	public void setUsageList(List<UsageData> usageList) {
		this.usageList = usageList;
	}
	
	
}
