package com.cg.demo.fun;

// functional interface - 
// which contains only one abstract method 
// which may contain one or more OTHER methods 

@FunctionalInterface
public interface FunIn {

	public abstract boolean functionalMethod(int i);
//	public abstract void anotherFunctionalMethod(); // CE for FI 

}