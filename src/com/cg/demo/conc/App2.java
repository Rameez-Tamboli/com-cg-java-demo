package com.cg.demo.conc;

public class App2 {

	static int num1 = 4578;

	public static void main(String[] args) {
		int num2;

		System.out.println(num1);

		if (num1 > 10) {
			num2 = 6;
			System.out.println(num1);
		} else if (num1 < 10) {
			num2 = 7;
			System.out.println(num2);
		}
//		System.out.println(num2); // 7, CE, 6, NO

	}

}