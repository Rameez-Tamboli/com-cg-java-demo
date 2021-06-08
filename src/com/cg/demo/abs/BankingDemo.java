package com.cg.demo.abs;

//interface Int1 {
//
//}
//
//interface Int2 {
//
//}
//
//class Class3 {
//
//}
//
//class Class4 extends Class3 implements Int1, Int2 {
//
//}

interface CentralGovtRules {
	public abstract void payInterest();
}

interface StateGovtRules {
	public abstract void giveLoan();
}

abstract class RBI { // abstract class

	// overridden 
	public abstract void doKyc(); // what? - Yes How? - No , abstract method

	public void openAccount() {
		System.out.println("Open account...");
	}
}

class HDFC extends RBI implements CentralGovtRules, StateGovtRules { // concrete class

	@Override
	public void doKyc() {// what? - Yes How? - Yes, concrete method
		System.out.println("Aadhaar");
	}

	public void giveLoan() {
		System.out.println("HDFC is Giving loan...");
	}

	public void payInterest() {
		System.out.println("HDFC is paying interest...");
	}

}

class ICICI {
	// write code here as well
}

public class BankingDemo {

	public static void main(String[] args) {

		HDFC hdfc = new HDFC();
		hdfc.doKyc();
		hdfc.openAccount();
		hdfc.payInterest();
		hdfc.giveLoan();

	}

}