package com.cg.Ex;

class RBI {

	public static void notes() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			Thread.sleep(500);
			System.out.println(i);
		}
	}

}

class HDFC {

	public static void dispenseNotes() throws InterruptedException {
		RBI.notes();
	}
}

public class ThrowsDemo {

	public static void main(String[] args) {
		try {
			HDFC.dispenseNotes();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//	public static void m1() { // your friend's uncle
//		System.out.println(10 / 0); // 1 - car
//	}
//
//	public static void m2() { // friend
//		ThrowsDemo.m1(); // 2
//	}
//
//	public static void m3() { // you
//		ThrowsDemo.m2(); // 3
//	}
//
//	public static void main(String[] args) {
//		System.out.println("Start");
//		ThrowsDemo.m3(); // 4 - driving
//		System.out.println("End");
//	}
}