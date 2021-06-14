//package com.cg.demo.col;
//
//import java.util.ArrayList;
//
//public class colDemo {
//
//	public static void main(String[] args) {
//
////		int[] numArray = new int[5];
////
////		int[] arr = { 10, 20, 30, 40, 50 }; // not growable not shrinkable
////
////		System.out.println(arr.length);
////
////		for (int i : arr) {
////			System.out.println(i);
////		}
//
////		List Set Map Queue 
//
//		ArrayList myList = new ArrayList();
//		System.out.println(myList.size());
//		myList.add(0);
//		myList.add(20.75);
//		myList.add("Abc");
//		myList.add("rameez");
//		System.out.println(myList.size());
//		System.out.println(myList);
//		
//		
//	}

package com.cg.demo.col;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ColDemo {

	public static void main(String[] args) {

//		int[] numArray = new int[5];
//
//		int[] arr = { 10, 20, 30, 40, 50 }; // not growable not shrinkable
//
//		System.out.println(arr.length);
//
//		for (int i : arr) {
//			System.out.println(i);
//		}

//		List Set Map Queue 

		ArrayList myList = new ArrayList();
		System.out.println(myList.size());
		myList.add(10);
		myList.add(20.75);
		myList.add("Abc");
		System.out.println(myList.size());
		System.out.println(myList.get(1));
		System.out.println(myList);

		List list = new ArrayList();

		List list2 = new LinkedList();

		list = list2;
//		myList = list2; // CE 

	}

}
