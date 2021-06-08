package com.cg.demo.method;

public class DemoClass {

	
	public int publicField=10;
	protected int ProtectedFeild=20;
	int packagefield =30;
	private int privateField = 40;
	
	public static void main(String[] args) {
		
		DemoClass obj = new DemoClass();
	
		System.out.println(obj.publicField);
		System.out.println(obj.ProtectedFeild);
		System.out.println(obj.packagefield);
		System.out.println(obj.privateField);
		
	}
	
	
	
	
}
