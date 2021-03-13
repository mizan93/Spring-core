package com.springcore.lifecycle;

import javax.annotation.PostConstruct;

import javax.annotation.PreDestroy;

public class Porota {

	private  String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Porota() {
		super();
	}

	@Override
	public String toString() {
		return "Porota [name=" + name + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}
	@PreDestroy
	public void end() {
		System.out.println("ending method");
	}
	
	
}
