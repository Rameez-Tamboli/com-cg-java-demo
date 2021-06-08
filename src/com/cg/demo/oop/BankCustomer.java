 package com.cg.demo.oop;
//access static member in static context - free access - class reference
	//access static member in non static context - free access - class reference
	//access non static member in static context - restricted access - object reference
	//access non static member in non static context - restricted access - ?? reference
	 
public class BankCustomer {
	//static field
	static int ifsc = 10112;
	//non static field
	
	int accNo;
	String name;
	double balance;
	
	
	void checkBalance() {
	System.out.println(balance);
	}
	
	static void openAccount() {
		// TODO Auto-generated method stub
			System.out.println("open an account");

	}
	
	public static void main(String[] args) {
		 BankCustomer c1 = new BankCustomer();
        c1.accNo = 101;
        c1.name = "Sonu";
        c1.balance = 10000;
        System.out.println(c1.accNo + " " + c1.name + " " + c1.balance);
        c1.checkBalance();
    //    checkBalance();
 //System.out.println(balance);
        	openAccount();
        	System.out.println(ifsc);
        	System.out.println(c1.ifsc);
        
        
      
        
    }

 

}
 



