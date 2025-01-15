package com.springcore.References;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {

	public static void main(String[] args) {
		
		ApplicationContext myContext = new ClassPathXmlApplicationContext("com/springcore/References/RefConfig.xml");
		
		A aObj = (A) myContext.getBean("aref");
		
		System.out.println(aObj.getX());
		System.out.println(aObj.getObj().getY());
		System.out.println(aObj);
	
	}

}
