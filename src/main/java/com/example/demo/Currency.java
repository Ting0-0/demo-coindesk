package com.example.demo;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;


@Entity
@Table
public class Currency {
	@Id  
	@Column
	private int id;
	
	@Column
	public String en_name;
	
	@Column
	public String ch_name;
  
	// getter and setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEnName() {
		return en_name;
	}
	public void setEnName(String name) {
		this.en_name = name;
	}
	public String getChName() {
		return ch_name;
	}
	public void setChName(String name) {
		this.ch_name = name;
	}
}

