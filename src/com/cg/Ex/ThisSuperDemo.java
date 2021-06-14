package com.cg.Ex;

interface MyInterface {

	public abstract void m1();
//	void m1();

}

class MyClass implements MyInterface {

	@Override
	public void m1() {
		// some code
	}
}

class Parent {
	int num = 5;

	public Parent() {
		System.out.println(this.num);
		System.out.println("Parent constructor");
	}

	public Parent(int num) {
		this.num = num;
	}
}

class Child extends Parent {
	int num = 10;

	public Child() {
		super();
		System.out.println("Child construvtor");
	}

	public Child(int num) {
		super(num);
		this.num = num;
	}

	public void someMethod() {
		System.out.println(super.num); // super class member
		System.out.println(this.num); // current class member
		System.out.println(num);
	}

}

public class ThisSuperDemo {

	public static void main(String[] args) {

		int num = 15;

		Child child = new Child();
		child.someMethod();
		System.out.println(num);

	}

}