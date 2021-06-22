
package com.cg.demo.ios;

import java.io.*;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {

		System.out.println("Start");

		FileInputStream fis = new FileInputStream("sample.txt");
		
		while (fis.available() > 0) {
			System.out.print((char) fis.read());
		}
		System.out.println("\nEnd");
		fis.close();
	}
}
