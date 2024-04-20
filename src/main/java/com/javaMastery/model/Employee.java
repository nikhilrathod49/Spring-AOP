package com.javaMastery.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String id;
	private String name;

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		System.out.println(" Set method is called..");
		this.id = id;
	}

	 
}