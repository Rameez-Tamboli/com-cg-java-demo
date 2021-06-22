package com.cg.demo.ios;

import java.io.*;
import java.util.Scanner;

public class SerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter name: ");
		String name = sc.next();
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();
		Employee emp = new Employee(id, name, salary);
		System.out.println("Enter file name:");

//		String file = sc.next();
		String file = "E:\\vaman\\emp.ser";

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			oos = new ObjectOutputStream(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			oos.writeObject(emp);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(emp.toString());
		System.out.println("Done");

		try {
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}