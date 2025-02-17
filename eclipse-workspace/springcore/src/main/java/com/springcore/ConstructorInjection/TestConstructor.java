package com.springcore.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructor {

	public static void main(String[] args) {
		ApplicationContext myContext = new ClassPathXmlApplicationContext(
				"com/springcore/ConstructorInjection/ConstConfig.xml");

		Person p1 = (Person) myContext.getBean("person");
		System.out.println(p1);
		
		Addition addObj = (Addition) myContext.getBean("add");
		addObj.doSum();
	}
}
