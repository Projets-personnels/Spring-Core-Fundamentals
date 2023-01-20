package com.springcore.ambiguityproblem;

public class First {
	private int a;
	private int b;
	
	
	public First(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor : int, int");
	}


	public First(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor : double, double");
	}
	
	public void doSum() {
		System.out.println("The sum is: " + (this.a + this.b));
	}
	
}
