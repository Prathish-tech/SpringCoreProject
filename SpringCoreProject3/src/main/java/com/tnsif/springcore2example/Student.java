package com.tnsif.springcore2example;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name="Sara";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void showStudent() {
		System.out.println("Student Name: "+name);
	}
}
