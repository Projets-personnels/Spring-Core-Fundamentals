package com.springcore.lifecycle;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		// registering shutdown hook
		context.registerShutdownHook();
		//lf1 f1 = (lf1) context.getBean("f1");
		
		//System.out.println(f1);
		
		
		
		//LfUsingInterface f2 = (LfUsingInterface) context.getBean("f2");
		
		//System.out.println(f2);
		
		Bill f3 = (Bill) context.getBean("f3");
		System.out.println(f3);

	}

}
