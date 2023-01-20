package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	// Autowiring is done through annotation
	
	/*
	 * 
	 * Types of autowiring annotations:-
	 * 
	 * 1) Autowired
	 * 2) Qualifier
	 * 
	 * */
	
	@Autowired
	@Qualifier("address")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
