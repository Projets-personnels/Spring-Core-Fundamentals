package com.springcore.lifecycle;

public class lf1 {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting the price");
		this.price = price;
	}

	public lf1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "lf1 [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside Init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
	
}
