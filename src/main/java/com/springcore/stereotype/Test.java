package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo.xml");
		
		Student st = (Student) con.getBean("st");
		
		System.out.println(st);

	}

}
