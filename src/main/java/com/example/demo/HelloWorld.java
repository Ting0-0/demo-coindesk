package com.example.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Configuration
@ComponentScan
@Controller
public class HelloWorld {
	
	@GetMapping("/")
	public String hello(){
		return "indexii";
	}

	
	@RequestMapping("/helloworld")
	public String helloworld(){
		return "Hello world! 此頁面使用 Maven + Spring Boot, IDE eclipse, database H2.";
	}
}

