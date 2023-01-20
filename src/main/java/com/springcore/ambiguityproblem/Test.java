package com.springcore.ambiguityproblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ambiguityproblem/apconfig.xml");
		
		First add = (First) context.getBean("add");
		
		First add2 = (First) context.getBean("add2");
		
		add.doSum();
		add2.doSum();

	}

}
