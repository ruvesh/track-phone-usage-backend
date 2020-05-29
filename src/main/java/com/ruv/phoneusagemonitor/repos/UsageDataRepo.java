package com.ruv.phoneusagemonitor.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ruv.phoneusagemonitor.model.UsageData;

public interface UsageDataRepo extends CrudRepository<UsageData, Integer> {
	public List<UsageData> findUsageDataByUserUsername(String username);
}