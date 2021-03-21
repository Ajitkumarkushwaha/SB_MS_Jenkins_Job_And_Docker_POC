package com.kushwaha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SbMsJenkinsJobAndDockerPocApplication {

	
	@GetMapping(value = "/welcome")
	public String printWelcomeMsg() {
		return "Welcome to Jenkins Job and Docker Integration !!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SbMsJenkinsJobAndDockerPocApplication.class, args);
	    System.out.println("Application Started !!");
	}

}
