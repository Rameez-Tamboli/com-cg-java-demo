package com.cg.demo;

public class NestedIfDemo {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		if (num1 >= 10) {
			System.out.println("num1");
			if (num2 > 10) { // nested if 
				System.out.println("num2");
			}

		}

	}
}