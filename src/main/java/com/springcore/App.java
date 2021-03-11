package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;
import com.springcore.constructor.Carti;
import com.springcore.constructor.Person;
import com.springcore.ref.A;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student1 = (Student) context.getBean("student1");
		Student student2 = (Student) context.getBean("student2");
		Emp emp1 = (Emp) context.getBean("emp1");
		A aref = (A) context.getBean("aref");
//		Person p = (Person) context.getBean("person1");
		Carti carti = (Carti) context.getBean("carti1");
		System.out.println(p);
//		System.out.println("Student2"+student2);
	}
}
