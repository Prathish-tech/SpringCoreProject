package com.tnsif.springcoreexample;

public class Student {
		private String name;
		
		public void setName(String name) {
			this.name =name;
		}
		public Student() {
			System.out.println("Student object created...");
		}
		public void display() {
			System.out.println("Student Name: "+name);
		}
}

