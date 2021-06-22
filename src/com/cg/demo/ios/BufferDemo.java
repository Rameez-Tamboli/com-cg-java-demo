package com.cg.demo.ios;

import java.io.*;

public class BufferDemo {

	public static void main(String[] args) throws IOException {
		String str;
		System.out.println("Start");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		str = br.readLine(); // Reading String
		System.out.println(str);
	}

}