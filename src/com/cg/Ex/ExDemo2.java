package com.cg.Ex;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExDemo2 {

	// happy path - edge cases

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter only integers:");

		int num = 0;
		try {
			num = sc.nextInt();
			sc.close();
		} catch (InputMismatchException e) {
			System.out.println("Please enter only integers");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(num);

		String s1 = "12458", s2 = "50";

		int i = Integer.parseInt(s1), j = Integer.parseInt(s2);

		System.out.println(i / j); // Exception

	}

}