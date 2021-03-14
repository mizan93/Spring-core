package com.springcore.autowire.antonation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp1 {

	@Autowired
	@Qualifier("")
	private Address adress;
	@Autowired
	@Qualifier("")
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
