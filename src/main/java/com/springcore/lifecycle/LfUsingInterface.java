package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LfUsingInterface implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LfUsingInterface() {
		super();
		
	}

	@Override
	public String toString() {
		return "LfUsingInterface [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		
		// init
		
		System.out.println("Inside init");
		
	}

	public void destroy() throws Exception {
		
		System.out.println("Inside Destroy method");
		
	}
	
	
	
	
}
