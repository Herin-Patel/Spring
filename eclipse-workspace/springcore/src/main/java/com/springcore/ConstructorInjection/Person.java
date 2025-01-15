package com.springcore.ConstructorInjection;

public class Person {
	private String name;
	private int personId;
	private Certificate certi;

	public Person(String name, int personId, Certificate certi) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Name : " + this.name + "\nPersonId : " + this.personId + "\nCertificate : " + this.certi.name;
	}
}
