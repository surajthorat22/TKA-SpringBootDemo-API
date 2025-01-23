package com.tka;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/thekiranacademy.com")
public class MyController {

	@PostMapping("/jobs")
	public String JobsApi() {
		return "Job Openings\r\n"
				+ "Exclusive job openings for students. Kickstart your career now.";
	}

	
	@PutMapping("/learn")
	public String learnApi() {
		return "Take a Online \r\n"
				+ "Check your experties & improve your skills";
	}
	
	@GetMapping("/tutorial")
	public String tutorialsApi() {
		return "A new way to enhance your programming skills\r\n"
				+ "Learn  Practice  Become a Java, Python, Selenium Developer";
	}
	
	@DeleteMapping("/mycources")
	public String mycourseApi() {
		return "Hi Suraj Thorat,\r\n"
				+ "Welcome to Ahmedabad";
	}
	
	
	
	
	
	
	
}
