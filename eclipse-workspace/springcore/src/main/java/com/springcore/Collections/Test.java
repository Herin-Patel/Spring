package com.springcore.Collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext myContext = new ClassPathXmlApplicationContext("com/springcore/Collections/EmpConfig.xml");
		
		Emp emp1 = (Emp) myContext.getBean("emp1");
		System.out.println(emp1);
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCourses());
	}

}
