package com.cg.demo.labs;

import java.util.Scanner;

/*
 * Lab 5: Exception Handling
 * Exercise 2: Write a Java Program to validate the full name of an employee. 
 * Create and throw a user defined exception if firstName and lastName is blank.
 */

class InvalidNameException extends Exception {
//	class InvalidNameException extends RuntimeException {

		private static final long serialVersionUID = 1L;

		public InvalidNameException(String error) {
			super(error);
		}

	}

public class LabDemo {

	// isBlank - Returns true if the string is empty or contains only white space
	// codepoints,otherwise false.
	// isEmpty - Returns true if, and only if, length() is 0.

	public boolean validateFullName(String firstName, String lastName) throws InvalidNameException {
		if (firstName.isBlank() || lastName.isBlank()) {
			throw new InvalidNameException("Name is invalid");
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Start");

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 1");
//		String firstName = sc.next();
//		System.out.println("Enter 2");
//		String lastName = sc.next();

		String firstName = " ";
		String lastName = "Monu";

		LabDemo labDemo = new LabDemo();

		try {
			System.out.println(labDemo.validateFullName(firstName, lastName));
		} catch (InvalidNameException e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}

}