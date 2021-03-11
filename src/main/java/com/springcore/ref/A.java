package com.springcore.ref;

public class A {
	private int X;
	private B oB;

	public A(int x, B oB) {
		super();
		X = x;
		this.oB = oB;
	}

	public A() {
		super();
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public B getoB() {
		return oB;
	}

	public void setoB(B oB) {
		this.oB = oB;
	}

	@Override
	public String toString() {
		return "A [X=" + X + ", oB=" + oB + "]";
	}

}
