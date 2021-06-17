package com.cg.demo.oop;
//A Argument - 	 money 
//R Return value - products 
//
//W A W R - shopping 
//W A N R - watch movie
//N A W R - get gifts 
//N A N R - window shopping 
//
//product shopping(money) {
//
//}

public class MethodsDemo {

	static void someMethod() {
		System.out.println("This is a void method.");
	}

	static int addTwoNumbers(int i, int j) {
		int k = i + j;
		return k;
	}

	static void addTwoNumbers2(int i, int j) {
		int k = i + j;
		System.out.println(k);
	}

	public static void main(String[] args) {
		System.out.println("main");

		System.out.println(addTwoNumbers(40, 50));

		int result = addTwoNumbers(10, 20);
//		int result2 = addTwoNumbers2(10, 20);

		System.out.println(result);

	}

}