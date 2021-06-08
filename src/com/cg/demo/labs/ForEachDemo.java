package com.cg.demo.labs;

public class ForEachDemo {

	public static void main(String[] args) {

		int[] myMarks = { 98, 95, 99, 97, 98, 92 };

		System.out.println("myMarks using for loop");

		for (int i = 0; i < myMarks.length; i++) {
			System.out.println(myMarks[i]);
		}

		System.out.println("myMarks using 'for each loop' or 'enhanced for loop'");

		for (int marks : myMarks) {
			System.out.println(marks);
		}
	}
}