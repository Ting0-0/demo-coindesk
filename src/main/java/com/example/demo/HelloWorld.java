package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloWorld {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@RequestMapping("/")
	public String hello(){
		return "此頁面使用 Maven + Spring Boot, IDE eclipse, database H2.";
	}
	
	@RequestMapping("/helloworld")
	public String helloworld(){
		return "Hello world! 此頁面使用 Maven + Spring Boot, IDE eclipse, database H2.";
	}
}

