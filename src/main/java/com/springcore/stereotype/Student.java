package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// Object is produced without beans.

@Component("st")
@Scope("prototype")

// Scope annotation is used to change the bean scope. Types of scopes are:- Singleton->default, prototype, session, request

public class Student {
	
	// @Value annotation is used to set the values in datatypes
	
	@Value("Anurag")
	private String studentName;
	
	@Value("Chandannagar")
	private String city;
	
	
	// This is spring expression Language
	
	@Value("#{temp}")
	private List<String> phNum;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	public List<String> getPhNum() {
		return phNum;
	}
	public void setPhNum(List<String> phNum) {
		this.phNum = phNum;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", phNum=" + phNum + "]";
	}
	
	
	
}
