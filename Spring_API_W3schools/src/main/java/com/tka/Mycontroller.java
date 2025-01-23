package com.tka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/w3shools.com")
public class Mycontroller {
	
	@RequestMapping(value = ("html"), method = RequestMethod.POST )
	public String htmlApi() {
		return "HTML is the standard markup language for Web pages.\r\n"
				+ "\r\n"
				+ "With HTML you can create your own Website.\r\n"
				+ "\r\n"
				+ "HTML is easy to learn - You will enjoy it!";
	}
	
	@RequestMapping(value = ("css"), method = RequestMethod.PUT )
	public String cssApi() {
		return "CSS is the language we use to style an HTML document.\r\n"
				+ "\r\n"
				+ "CSS describes how HTML elements should be displayed.\r\n"
				+ "\r\n"
				+ "This tutorial will teach you CSS from basic to advanced.";
	}
	
	@RequestMapping(value = ("java"), method = RequestMethod.GET )
	public String javaApi() {
		return "Java is a popular programming language.\r\n"
				+ "\r\n"
				+ "Java is used to develop mobile apps, web apps, desktop apps, games and much more";
	}
	
	@RequestMapping(value = ("python"), method = RequestMethod.DELETE )
	public String pythonApi() {
		return "Python is a popular programming language.\r\n"
				+ "\r\n"
				+ "Python can be used on a server to create web applications.";
	}
	

}
