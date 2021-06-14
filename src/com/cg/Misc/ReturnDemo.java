package com.cg.Misc;

class ClassOne {

}

class ClassTwo {

	public ClassOne methodName() {

		return new ClassOne();
	}

	public void anotherMethod(ClassOne obj) {
		System.out.println(obj.toString());
	}

	public int m1(int num) {
		return 10;
	}

}

public class ReturnDemo {

	public static void main(String[] args) {

		ClassOne classOne = new ClassOne();

		ClassTwo classTwo = new ClassTwo();
		classTwo.anotherMethod(classOne);

	}

}