package com.cg.demo.oop;

// return types of methods 

public class MethodDemo {

//	returnType methodName(arguments) {
//       	statements;
//} 

	static void someMethodName() {
		System.out.println("Some output");
	}

	static void addTwoNumbers(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static void main(String[] args) {

		System.out.println("Start");

		someMethodName();

		addTwoNumbers(10, 20);
		addTwoNumbers(5, 5);
		addTwoNumbers(15, 25);

	}

}