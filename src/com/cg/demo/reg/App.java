package com.cg.demo.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

	public static void main(String[] args) {

		String str = "9876543210";		
//		System.out.println("******" + str.substring(6));
		
//		91**55**10
		
		System.out.println(str.substring(0, 2) + "**" + str.substring(4, 6));

//		String str = "BCD";
		String str2 = "ABCDE";
		Pattern pattern = Pattern.compile(str);
		Matcher matcher = pattern.matcher(str2);

		System.out.println(matcher.matches()); // false // exact match 
		System.out.println(matcher.lookingAt()); // false // match in the beginning   
		System.out.println(matcher.find()); // true // match anywhere 

	}

}