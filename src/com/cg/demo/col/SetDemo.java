package com.cg.demo.col;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<Integer> mySet = new HashSet<Integer>();

		mySet.add(10);
		mySet.add(50);
		mySet.add(10);
		mySet.add(30);

		System.out.println(mySet);
//no duplicate is allowed 
	}

}