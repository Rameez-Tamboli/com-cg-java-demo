package com.cg.demo.stre;
package com.cg.demo.stre;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListUpdateDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Vaman", 10000));
		empList.add(new Employee(102, "Raman", 18000));
		empList.add(new Employee(103, "Soman", 12000));
		empList.add(new Employee(104, "Suman", 15000));
		empList.add(new Employee(105, "Lakshman", 20000));

		System.out.println(empList);

		ListIterator<Employee> it = empList.listIterator();

		while (it.hasNext()) {
			it.next().salary += 1000;
		}
		System.out.println(empList);

	}

}