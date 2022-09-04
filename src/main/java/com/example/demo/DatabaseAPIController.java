package com.example.demo;

import java.util.Arrays;
import java.util.List; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.beans.factory.annotation.Autowired;  

@RestController
@RequestMapping("/api")
public class DatabaseAPIController {
	@Autowired  
	CurrencyService currencyService;  
	
	@GetMapping("/checkpage")
	public String apiCheckPage() {  
		return "{get(/id,/name), post, put, delete}";  
	}
	
	//read all  
	@GetMapping("/")  
	public List<Currency> getAllCurrency() {
		System.out.println(Arrays.toString(currencyService.getAll().toArray()));
		return currencyService.getAll();  
	}
	
	//read one by ID  
	@GetMapping("/{id}")  
	public Currency getCurrencyByID(@PathVariable("id") int id) {  
		return currencyService.getById(id);  
	}
	
	//read one by name (search) 
	@GetMapping("/search/{name}")  
	public List<Currency> getCurrenciesByName(@PathVariable("name") String name) {  
		return currencyService.getByName(name);  
	}  
	
	//create a new row of data 
	@PostMapping("/")
	public int addCurrency(@RequestBody Currency currency) {  
		currencyService.create(currency);  
		return currency.getId();  
	}
	
	//update one date  
	@PutMapping("/")
	public int updateCurrency(@RequestBody Currency currency) {  
		currencyService.update(currency);  
		return currency.getId();  
	}

	//delete one by ID  
	@DeleteMapping("/{id}")  
	public void deleteCurrency(@PathVariable("id") int id) {  
		currencyService.delete(id);  
	}  
}
