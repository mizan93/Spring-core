package com.springcore.constructor;

public class Addition {

	private int a;
	private int b;

	public Addition(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
//		System.out.println("double called.");

	}

	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
//		System.out.println("integer called.");
	}

	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
//		System.out.println("String called.");
	}

	public void dosum() {
		System.out.println("sum is : " + (this.a + this.b));
	}

}
