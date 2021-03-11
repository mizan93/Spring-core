package com.springcore.constructor;

public class Person {

	private String id;
	private String name;
	private Carti carti;

	public Person(String id, String name, Carti carti) {
		super();
		this.id = id;
		this.name = name;
		this.carti = carti;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", carti=" + carti + "]";
	}

}
