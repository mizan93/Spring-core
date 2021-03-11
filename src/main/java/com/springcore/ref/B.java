package com.springcore.ref;

public class B {
	private int Y;

	public B(int y) {
		super();
		Y = y;
	}

	public B() {
		super();
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	@Override
	public String toString() {
		return "B [Y=" + Y + "]";
	}

}
