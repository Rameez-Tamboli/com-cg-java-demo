
package com.cg.Ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExDemo {

	// robust - exception handling, garbage collection

	public static int divide() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter 1");
			int num1 = sc.nextInt();
			System.out.println("Enter 2");
			int num2 = sc.nextInt();
			return num1 / num2;
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println(ae);
			System.out.println("Do not divide by zero.");
			return 0; // business decision
		} catch (InputMismatchException ime) {
			System.out.println("Please enter only integer.");
			return 0;
		} catch (Exception e) {
			System.out.println("Something is wrong.");
			return 0;
		} finally {
			System.out.println("finally...");
			sc.close();
		}
	}

	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println(ExDemo.divide());
		System.out.println("End");
	}
}