package com.cg.demo.method;

/*
 * Constructor - 
 * It is used to create and initialize object.
 * It is a special type of method in Java. 
 * It does not have any return type. 
 * Constructor name is same as class name. 
 * By default, Java provides one default constructor.  
 * We can create our own constructors. 
 * If we create our constructors, Java does not provide any constructors. 
 * 
 * 
 * 
 */

public class Employee {

	int id;
	String name;
	double salary;

	public Employee() {
		System.out.println("default constructor");
	}

	Employee(int id, String name) {
		this.id =id;
		this.name=name;
		this.salary=salary;
		
		System.out.println("parameterized constructor");
	}

	Employee(int id, String name, double salary) {
		this.id =id;
		this.name=name;
		this.salary=salary;
		
		System.out.println("three parameterized constructor");
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}