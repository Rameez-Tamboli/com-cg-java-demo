package com.cg.demo.reg;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailDemo {

	public static void main(String[] args) {

		String email = "sonu.surname@gmail.com";
//		String regex = "[^\\d][\\w-.]+[@][^\\d][\\w]+[\\.][^\\d][\\w]+";
		String regex = "[\\D][\\w.]+[@][\\D][\\w]+[\\.][\\D][\\w]+";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		System.out.println(m.matches());

	}

}