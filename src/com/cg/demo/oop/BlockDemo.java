package com.cg.demo.oop;

public class BlockDemo {

	static int num = 10;

	public static void main(String[] args) {
		System.out.println("main");

		BlockDemo obj = new BlockDemo();
		BlockDemo obj2 = new BlockDemo();
		BlockDemo obj3 = new BlockDemo();

		BlockDemo.m1();
		System.out.println(num);
	}

	{
		System.out.println("non static block");
	}

	{
		System.out.println("another non static block");
	}

	static {
		System.out.println("static block");
	}

	static {
		System.out.println("another static block");
	}

	static void m1() {
		System.out.println("m1");
	}
}
