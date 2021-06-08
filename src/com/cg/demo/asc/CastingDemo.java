package com.cg.demo.asc;

public class CastingDemo {

	public static void main(String[] args) {

//		// byte short char int long
//		byte b1 = 100;
//		byte b2 = 27;
////		int b3 = b1 + b2; // automatic type casting - lower type to higher type 
//		byte b3 = (byte) (b1 + b2); // manual type casting - higher to lower type
//		System.out.println(b3);

		int num = 65;
		System.out.println(num);

		char grade = (char) num;

		System.out.println(grade);

	}

}