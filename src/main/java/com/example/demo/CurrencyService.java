package com.example.demo;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

@Service  
public class CurrencyService {
	@Autowired  
	CurrencyRepository currencyRepository;  
	
	//read all  
	public List<Currency> getAll() { 
		List<Currency> currencies = new ArrayList<Currency>();  
		currencyRepository.findAll().forEach(currency -> currencies.add(currency));  
		return currencies;  
	}
	
	//read one by ID  
	public Currency getById(int id) {  
		return currencyRepository.findById(id).get();  
	}

	//read one by name  
	public List<Currency> getByName(String name) {
		List<Currency> currencies = new ArrayList<Currency>(); 
		currencyRepository.findAll().forEach(currency -> {
			if(currency.getEnName().contains(name) || currency.getChName().contains(name)) {
				currencies.add(currency);
			}
		}); 
		return currencies;
	}
	
	//create a new one
	public void create(Currency currency) {  
		currencyRepository.save(currency);  
	}

	//updating a specific record  
	public void update(Currency currency) {  
		currencyRepository.save(currency);  
	}  
	
	//deleting a specific record  
	public void delete(int id) {  
		currencyRepository.deleteById(id);  
	}   
}
