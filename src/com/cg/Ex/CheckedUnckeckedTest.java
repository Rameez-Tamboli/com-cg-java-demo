
package com.cg.Ex;

public class CheckedUnckeckedTest {

	public static void main(String[] args) {

		System.out.println("Start");

// 		System.out.println(0 / 0); // ArithmeticException - unchecked 

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // InterruptedException - checked exception 

		System.out.println("End");
	}

}