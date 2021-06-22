package com.cg.demo.conc;

class Parent {

	public static void m1() {
		System.out.println("parent m1");
	}
}

class Child extends Parent {

	public static void m1() {
		System.out.println("child m1");
	}
}
//	CE RE NE

public class App4 {

}