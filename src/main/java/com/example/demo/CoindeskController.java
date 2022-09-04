package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/coindesk")
public class CoindeskController {
	@Autowired  
	CoindeskService coindeskService;
	
	@GetMapping("/")
	public String coindesk() {
		String rs = coindeskService.getFromCoindesk();
	    return rs;
	}
}
