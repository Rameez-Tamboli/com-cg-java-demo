package com.cg.demo.str;

public class StringDemo {

	public static void main(String[] args) {

		String str = "abcd";
		System.out.println(str);
		str.concat("efgh");
		System.out.println(str);

		StringBuffer sbf = new StringBuffer("abcd");
		System.out.println(sbf);
		sbf.append("efgh");
		System.out.println(sbf);

		StringBuilder sbd = new StringBuilder("ijkl");
		System.out.println(sbd);
		sbd.append("mnop");
		System.out.println(sbd);

		sbf.reverse();
		System.out.println(sbf);
		System.out.println(sbf + "|" + sbf.reverse());

	}

}