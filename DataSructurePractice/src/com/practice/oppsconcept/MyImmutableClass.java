package com.practice.oppsconcept;

import java.util.Date;

public final class MyImmutableClass {

	final private int age;
	final private String name;
	final private String address;
	final private Date dateOfBirth;
	//final private ResidentialAddress resedentialAddress;
// Use Child class of ResidentialAddress instead.
	final private ChildAddress childAddress;
	public Date getDateOfBirth() {
		return new Date();
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public MyImmutableClass(int age, String name, String address, Date dateOfBirth, ChildAddress childAddress) {
		super();
		this.dateOfBirth = dateOfBirth;
		this.childAddress= childAddress;
        this.age = age;
		this.name = name;
		this.address = address;
	}

}
