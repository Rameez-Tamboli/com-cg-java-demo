
package com.cg.demo.conc;

public class Examq {
	public static void main(String[] args) {
		String str = "-";
		switch ("RED".toLowerCase()) {
		case "RED":
			str += "R";
		case "red":
			str += "r";
		case "green":
			str += "g";
		}
		System.out.println(str);
	}
}