

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.autowire.antonation.Emp1;
import com.springcore.collections.Emp;
import com.springcore.constructor.Addition;
import com.springcore.constructor.Carti;
import com.springcore.constructor.Person;
import com.springcore.lifecycle.Pepsi;
import com.springcore.lifecycle.Porota;
import com.springcore.lifecycle.Samosa;
import com.springcore.ref.A;
import com.springcore.stanalone.collection.Person2;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		Student student1 = (Student) context.getBean("student1");
//		Student student2 = (Student) context.getBean("student2");
//		Emp emp1 = (Emp) context.getBean("emp1");
//		A aref = (A) context.getBean("aref");
//		Person p = (Person) context.getBean("person1");
//		Carti carti = (Carti) context.getBean("carti1");
//		Addition add = (Addition) context.getBean("add");
//		context.registerShutdownHook();
//		Samosa samosa = (Samosa) context.getBean("samosa");
//		Pepsi pepsi = (Pepsi) context.getBean("pepsi");
//		Porota porota = (Porota) context.getBean("porota");
		Emp1 emp = context.getBean("emp11", Emp1.class);
		Person2 person2 = context.getBean("person11", Person2.class);
		System.out.println(person2.getFriends());
		System.out.println(person2.getFriends().getClass().getName());
		System.out.println("____________________________________________");
		System.out.println(person2.getFeesStructure());
		System.out.println(person2.getFeesStructure().getClass().getName());
		System.out.println("____________________________________________");
		System.out.println(person2.getProperties());
		System.out.println(person2.getProperties().getClass().getName());

	}
}
