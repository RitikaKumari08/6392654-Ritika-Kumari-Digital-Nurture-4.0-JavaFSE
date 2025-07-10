package com.cognizant.spring_learn_authentication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot Application Class for JWT Authentication Service
 */
@SpringBootApplication
public class SpringLearnAuthenticationApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringLearnAuthenticationApplication.class);

	public static void main(String[] args) {
		logger.info("=================================================================");
		logger.info("Starting JWT Authentication Service Application...");
		logger.info("=================================================================");
		
		// Start the Spring Boot application
		SpringApplication.run(SpringLearnAuthenticationApplication.class, args);
		
		logger.info("=================================================================");
		logger.info("JWT Authentication Service started successfully!");
		logger.info("Application is running on: http://localhost:8094");
		logger.info("");
		logger.info("Authentication endpoint:");
		logger.info("  curl -s -u user:pwd http://localhost:8094/authenticate");
		logger.info("");
		logger.info("Valid credentials:");
		logger.info("  - user:pwd");
		logger.info("  - admin:admin");
		logger.info("  - test:test");
		logger.info("");
		logger.info("Other endpoints:");
		logger.info("  - Health Check: http://localhost:8094/health");
		logger.info("  - Home: http://localhost:8094/");
		logger.info("=================================================================");
	}
}
