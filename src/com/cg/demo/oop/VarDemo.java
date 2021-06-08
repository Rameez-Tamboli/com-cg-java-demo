package com.cg.demo.oop;

class Abc {
	int num5;
	static int num6;
}

public class VarDemo {

	// fields
	int num1; // instance variable / field
	static int num2 = 20; // static variables / field

	void m1() {
		// local variables
		int num3;
	}

	public static void main(String[] args) {
		// local variables
		int num4;
//		System.out.println(num4);
		num4 = 10;
		System.out.println(num4);

		System.out.println(VarDemo.num2);
		System.out.println(Abc.num6);
		Abc abc = new Abc();
		System.out.println(abc.num5);
//		System.out.println(num3);
		int num2 = 10;
	}
}