package com.cg.Misc;

public class FinalDemo {

	public final int NUM1 = 10;
	public static final int NUM2 = 20;

	public static void main(String[] args) {

		FinalDemo finalDemo = new FinalDemo();
		System.out.println(finalDemo.NUM1);
//		finalDemo.num1 = 15;

		System.out.println(FinalDemo.NUM2);
//		FinalDemo.num2 = 25;

	}

}
