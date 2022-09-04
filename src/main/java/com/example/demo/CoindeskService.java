package com.example.demo;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CoindeskService {
	private RestTemplate restTemplate;
	
	public CoindeskService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
	
	public String getFromCoindesk() {
		String url = "https://api.coindesk.com/v1/bpi/currentprice.json";
		String rs =  this.restTemplate.getForObject(url, String.class);
	    return rs;
	}
}
