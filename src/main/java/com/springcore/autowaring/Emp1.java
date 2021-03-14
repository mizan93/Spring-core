package com.springcore.autowaring;


public class Emp1 {

	private Address adress;
	private Name name;

	public Emp1(Address adress, Name name) {
		super();
		this.adress = adress;
		this.name = name;
		System.out.println("inside constructor");
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	public Emp1() {
		super();
	}

	

	@Override
	public String toString() {
		return "Emp1 [adress=" + adress + ", name=" + name + "]";
	}
	
}
