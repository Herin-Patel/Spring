package com.springcore.ConstructorInjection;

public class Addition {
	private int a;
	private int b;

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor : int, int");
	}

	public Addition(double a, double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Constructor : double, double");
	}
	
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor : String, String");
	}
	
	public void doSum() {
		System.out.println("Value of 1st arg = " + a);
		System.out.println("Value of 2nd arf = " + b);
		System.out.printf("Sum is = %d", (this.a+this.b));
	}
}
