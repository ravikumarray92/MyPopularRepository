package com.practice.oppsconcept;

public class Student implements Age, Address, Builder {

	private String address;
	private int age;

	@Override
	public Address setAddress(String address) {
		this.address = address;
		return this;
	}

	@Override
	public Address setAge(int age) {
		this.age = age;
		return this;
	}

	public Age build() {
		return this;
	}
	
	private Student() {}
	
	static Builder getStudentObject() {
		
		return new Student();
	}

}
