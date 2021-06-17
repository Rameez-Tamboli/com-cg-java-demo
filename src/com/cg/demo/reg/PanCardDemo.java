package com.cg.demo.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanCardDemo {

	public static void main(String[] args) {

//		String pan = "ABCDE1234F";
//		String pan = "SERTA4598Q";
//		String pan = "SERA4598Q";
		String pan = "SERTA45wwQ";

		String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(pan);
		System.out.println(m.matches());

	}

}
