package com.cg.demo.method;

public class Product {

	//four fields
	int id;
	String name;
	double mrp;
	double sell_value;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	




	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Product(int id, String name, double mrp, double sell_value) {
		super();
		this.id = id;
		this.name = name;
		this.mrp = mrp;
		this.sell_value = sell_value;
	}



	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", mrp=" + mrp + ", sell_value=" + sell_value + "]";
	}
	
	
	
//	Product() {
//		System.out.println("Product Info");
//	}
//
//	Product(int id, String name) {
//		this.id =id;
//		this.name=name;
//		//this.mrp=mrp;
//		
//		System.out.println("Pruduct ID, Name");
//	}
//
//	Product(int id, String name, double mrp) {
//		this.id =id;
//		this.name=name;
//		this.mrp=mrp;
//		
//		System.out.println("Pruduct ID, Name,mrp");
//	}
//		Product(int id, String name, double mrp,double sell_value) {
//			this.id =id;
//			this.name=name;
//			this.mrp=mrp;
//			this.sell_value=sell_value;
//			System.out.println("Pruduct ID, Name,mrp");
//		}
		
	
	
	
	
	
	
	
	
}
