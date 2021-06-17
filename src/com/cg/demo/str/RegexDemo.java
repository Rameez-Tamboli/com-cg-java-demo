package com.cg.demo.str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {

		// validate email
		String email = "aaa"; //
		System.out.println(email);
		Pattern pattern = Pattern.compile(email);

		Matcher matcher = pattern.matcher("[a-z]*");

		System.out.println(matcher.matches());

	}

}