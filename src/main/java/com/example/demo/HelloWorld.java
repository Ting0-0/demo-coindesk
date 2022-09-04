package com.example.demo;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HelloWorld {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	@RequestMapping("/")
	@GetMapping("/")
	public String hello(){
		return "index";//"此頁面使用 Maven + Spring Boot, IDE eclipse, database H2.";
	}
	
	@RequestMapping("/helloworld")
	public String helloworld(){
		return "Hello world! 此頁面使用 Maven + Spring Boot, IDE eclipse, database H2.";
	}
}

