  
package com.cg.demo.conc;

public class App5 {

	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = "hello";
		if (str1.equalsIgnoreCase(str2))
			System.out.println("Equals");
		else
			System.out.println("NotEqual");
	}
}