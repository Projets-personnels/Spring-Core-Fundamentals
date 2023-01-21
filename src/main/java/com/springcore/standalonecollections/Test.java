package com.springcore.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalonecollections/config.xml");
		
		Person p1 = (Person) context.getBean("p1");
		
		System.out.println(p1);
		System.out.println(p1.getFriends().getClass());
		System.out.println(p1.getFriends().getClass().getName());
		
		System.out.println(p1.getFeeStr().getClass().getName());

	}

}
