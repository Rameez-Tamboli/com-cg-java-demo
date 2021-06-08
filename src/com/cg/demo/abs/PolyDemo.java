package com.cg.demo.abs;

// Polymorphism - methods with the same name having different functionalities 

// compile time polymorphism - method overloading - early binding 
// possible with both static and non static methods 
// with static methods, possible only in one class 
// with non static methods, possible one class, or super + sub classes  
// three types 
// 1. different number of arguments 
// 2. different types of arguments 
// 3. different order of arguments 

// run time polymorphism - method overriding - late binding 
// possible only with non static methods 
// possible only in super + sub classes 
// complete method signature is same 

public class PolyDemo {

	public int add(int i, int j) {
		return i + j;
	}

	// 1. different number of arguments
	public int add(int i, int j, int k) {
		return i + j + k;
	}

	public int add(int i, int j, int k, int l) {
		return i + j + k + l;
	}

	// 2. different types of arguments
	public int add(int i, byte j) {
		return i + j;
	}

	// 3. different order of arguments
	public int add(byte i, int j) {
		return i + j;
	}

//	public int add(double i, int j) {
//		return (int) (i + j);
//	}

	public static void main(String[] args) {

		PolyDemo polyDemo = new PolyDemo();
		System.out.println(polyDemo.add(10, 20));
		System.out.println(polyDemo.add(10, 20, 30));
		System.out.println(polyDemo.add(10, 20, 30, 40));
		byte arg1 = 10;
		int arg2 = 20;
		System.out.println(polyDemo.add(arg1, arg2));
		System.out.println(polyDemo.add(arg2, arg1));

		// System.out.println(polyDemo.add(10.5, 10));
	}
}