package com.cg.demo.oop;

// DRY - Don't Repeat Yourself

public class MethodDemo2 {

	static void makeCoffee() {

		System.out.println("Steps to prepare coffee- ");
		System.out.println("Boil water.");
		System.out.println("Add coffee powder.");
		System.out.println("Add suger.");
		System.out.println("Add milk.");
		System.out.println("Serve.");
	}

	public static void main(String[] args) {

		System.out.println("Start");
		makeCoffee();
		makeCoffee();

		System.out.println("End");
	}

}