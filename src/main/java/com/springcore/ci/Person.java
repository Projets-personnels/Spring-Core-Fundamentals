package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int id;
	private Certi certi;
	private List<String> phNum;
	
	
	public Person(String name, int id, Certi certi, List<String> phNum) {
		super();
		this.name = name;
		this.id = id;
		this.certi = certi;
		this.phNum = phNum;
	}


	@Override
	public String toString() {
		return this.name + " of id:" + this.id + " and the certificate is " + this.certi.name + " phone numbers are " + this.phNum;
	}
	
	
}
