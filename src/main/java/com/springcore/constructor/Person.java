package com.springcore.constructor;

import java.util.List;

public class Person {

	private String id;
	private String name;
	private Carti carti;
	private List<String> list;

	public Person(String id, String name, Carti carti, List<String> list) {
		super();
		this.id = id;
		this.name = name;
		this.carti = carti;
		this.list = list;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", carti=" + carti + ", list=" + list + "]";
	}

}
