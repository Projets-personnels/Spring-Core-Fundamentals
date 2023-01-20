package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bill {
	private String subject;

	
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	} 
	
	@Override
	public String toString() {
		return "Bill [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting the method");
	}
	
	
	@PreDestroy
	public void end() {
		System.out.println("Ending the method");
	}

}
