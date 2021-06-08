package com.cg.demo.method;

public class App2 {

	
	public static void main(String[] args) {
	
	
	Product obj = new Product();
	obj.id=1084541;
	obj.name="gh";
	obj.mrp=10;
	obj.sell_value=9.25;
	
	System.out.println(obj.toString());
	
	
	
	Product obj2 = new Product();
	obj2.id = 102;
	obj2.name = "Bbc";
	obj2.mrp = 15.25;
	System.out.println(obj2.toString());
	


	
	Product obj5 = new Product(105, "bee", 0,0.122);
	System.out.println(obj5.toString());
//	
	
	
	
	
}
}
