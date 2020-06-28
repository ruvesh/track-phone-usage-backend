package com.ruv.phoneusagemonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PhoneUsageMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhoneUsageMonitorApplication.class, args);
		System.out.println("----Phone Usage Monitor Service is Running");
	}

	@Bean
    public WebMvcConfigurer corsConfigurer(){
	    String origin = "http://localhost:3000";
	    String[] pathPatterns = {
	            "/users", "/users/{username}", "/login", "/users/{username}/usage", "/users/usage"
        };
	    return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                for(String pattern : pathPatterns) {
                    registry.addMapping(pattern).allowedOrigins(origin);
                }
            }
        };
    }
}
