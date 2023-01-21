package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration


// configuring the base package
@ComponentScan(basePackages = "com.springcore.javaconfig")

public class JavaConfig {
	
	@Bean
	public Pizza getPizza() {
		return new Pizza();
	}
	
	@Bean
	public Student getStudent() {
		
		//creating a new object 
		Student student = new Student(getPizza());
		
		return student;
	}

}
