package com.ruv.phoneusagemonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhoneUsageMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhoneUsageMonitorApplication.class, args);
		System.out.println("----Phone Usage Monitor Service is Running");
	}

}
