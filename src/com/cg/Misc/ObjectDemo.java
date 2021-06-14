package com.cg.Misc;

class Parent {

}

class Child extends Parent {

}

class Child2 extends Parent {

}

class University {

	public void getDegree() {
		System.out.println("getDegree");
	}

}

class College1 extends University {

	public void learnSubject1() {
		System.out.println("learnSubject1");
	}

}

class College2 extends University {

	public void learnSubject2() {
		System.out.println("learnSubject2");
	}

}

public class ObjectDemo {

	public static void main(String[] args) {

		College1 collegeStudent1 = new College1();
		College2 collegeStudent2 = new College2();

//		collegeStudent1 = collegeStudent2;

		collegeStudent1.getDegree();
		collegeStudent1.learnSubject1();
		collegeStudent2.getDegree();
		collegeStudent2.learnSubject2();

		int num = 10; // 9, 10, 11

		University universityStudent1 = new College1();

		University universityStudent2 = new College2();

		universityStudent1 = universityStudent2;
		universityStudent1.getDegree();

//		universityStudent1.learnSubject1();
		((College1) universityStudent1).learnSubject1();

		universityStudent2.getDegree();
//		universityStudent2.learnSubject2();

		Parent child1 = new Child();
		Child child12 = new Child();
		Parent child2 = new Child2();
		Child2 child22 = new Child2();

//		child12 = child22;

		child1 = child2;

	}

}