package com.javaMastery.model;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private String id;
	private String name;

	public Student() {
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
		this.id = id;
	}
 
}