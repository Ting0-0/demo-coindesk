package com.example.demo;

import org.springframework.data.repository.CrudRepository; 

//參考資料：https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
public interface CurrencyRepository extends CrudRepository<Currency, Integer> {
	
}
