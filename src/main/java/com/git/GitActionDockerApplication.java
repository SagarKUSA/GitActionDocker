package com.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitActionDockerApplication {
	
	@GetMapping("/Get")
	public String get() {
		return "Docker with gitub action CICD";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(GitActionDockerApplication.class, args);
	}

}
