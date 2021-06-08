package com.cg.demo;
import java.util.Scanner;

public class LogicalDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter int");
	//	int salary=12,leaves =25,expectedSalary =10,expectedleaves=30;
		
		
		int salary = sc.nextInt();
		int leaves = sc.nextInt();
		int expectedSalary = sc.nextInt();
		int expectedleaves = sc.nextInt();
		
		System.out.println(salary>= expectedSalary);
		System.out.println(leaves >=expectedleaves);
		
		System.out.println((salary >= expectedSalary) && (leaves >= expectedleaves)); // false 

		System.out.println((salary >= expectedSalary) || (leaves >= expectedleaves)); // true 
		if (salary >expectedSalary) {
			
			System.out.println("join copmpany");
		}else {
			System.out.println("do not join");
		
		
//		System.out.println((salary >= expectedSalary));
//		
//		System.out.println(salary >= expectedSalary);
//		System.out.println(leaves >= expectedleaves);
//
//		System.out.println((salary >= expectedSalary) && (leaves >= expectedleaves)); // false 
//
//		System.out.println((salary >= expectedSalary) || (leaves >= expectedleaves)); // true 
//		if (salary >expectedSalary) {
//			
//			System.out.println("join copmpany");
//		}else {
//			System.out.println("do not join");
//			
		}
		
	}
}
