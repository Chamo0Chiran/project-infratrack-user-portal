package com.G153.InfratrackUserPortal;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InfratrackUserPortalApplication {

	public static void main(String[] args) {
		// Load .env file
		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

		// Set environment variables for Spring Boot
		System.setProperty("MONGO_URI", dotenv.get("MONGO_URI"));
		SpringApplication.run(InfratrackUserPortalApplication.class, args);
	}

}
