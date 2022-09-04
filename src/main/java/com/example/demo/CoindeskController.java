package com.example.demo;

import java.util.Dictionary;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;
//import org.springframework.web.client.RestTemplate;
import com.google.gson.Gson;



@RestController
@RequestMapping("/coindesk")
public class CoindeskController {
	@Autowired  
	CoindeskService coindeskService;
	
	
	public class Coindesk {
	  @JsonProperty("time")
//	  public Dictionary<String, String> time;
//	  public Time time;
	  public String time;

	  @JsonProperty("bpi")
	  public Map<String, String> bpi;
//	  public Dictionary<String, Rate> bpi;
	}
	public class Time {
		@JsonProperty("updated") public String updated;
		@JsonProperty("updatedISO") public String ISO;
		@JsonProperty("updateduk") public String updateduk;
	}
	public class Rate {
	  @JsonProperty("code") public String code;
	  @JsonProperty("rate") public Float rate;
	}
	
	@GetMapping("")
	public String coindesk() {
		String rs = coindeskService.getFromCoindesk();
		return rs;
	}
	
	@GetMapping("/time")
	public String coindeskTime() {
		String rs = coindeskService.getFromCoindesk();
		try {
			Gson gson = new Gson(); // Or use new GsonBuilder().create();
			Coindesk data = gson.fromJson(rs, Coindesk.class);
			Time time = gson.fromJson(data.time, Time.class);
		    return gson.toJson(time);
		}catch(Exception e){
			return e.toString();
		}
	}
	
//	@GetMapping("/rate")
//	public String coindeskRate() {
//		String rs = coindeskService.getFromCoindesk();
//		try {
//			Gson gson = new Gson(); // Or use new GsonBuilder().create();
//			Coindesk data = gson.fromJson(rs, Coindesk.class);
//			List<Rate> rates = gson.fromJson(data.bpi[1], List<Rate>.class);
//		    return gson.toJson(rates);
//		}catch(Exception e){
//			return e.toString();
//		}
//	}


}
