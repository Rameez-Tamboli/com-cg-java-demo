package com.cg.demo.col;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class EmpDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Employee emp = new Employee();
		Delete delete = new Delete();

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(emp);
		empList.add(new Employee());
		empList.add(new Employee(103, "Aaa", 10.5));
		empList.add(new Employee(104, "Bbb", 45.5));

		System.out.println("Iterate using for loop");

		for (int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i).toString());
		}

		System.out.println("Iterate using for each loop");

		for (Employee e : empList) {
			System.out.println(e.toString());
		}

		System.out.println("Iterate using Iterator");

		Iterator<Employee> iterator = empList.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}

		// empList.add("Aaa"); // CE
		
//		empList.add(delete); // CE
//		Stack stack = new Stack();		
//		Vector vector = new Vector(3, 3);
//		System.out.println(stack.size());
//		System.out.println(stack.capacity());

	}

}