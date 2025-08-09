package com.tnsif.springcore2example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {
	private Student student;
    
	//Constructor injection
	@Autowired
	public College(Student student) {
		super();
		this.student = student;
	}
	public void showCollegeDetails() {
		System.out.println("Welcome to college");
		student.showStudent();
	}
}
