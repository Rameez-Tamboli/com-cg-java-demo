package com.cg.demo;
import java.util.Scanner;
public class combination{
		
		int=empid;
		String=name;
		String=dept ;
		double=salary ;
		String=address;
	       
		Emp ()
	       {
			empid=1;
			name="tukaram ";
			dept="R&D";
			salary=50000;
			address=" Udgie";
	       }
		
		Emp (int empid,String name,String dept,double salary,String address)
	    {
			this.empid=empid;
			this.name=name;
			this.dept=dept;
			this.salary=salary;
			this.address=address;
	    }
		
		void displayEmpdetails()
		{
			System.out.println("Empid ="+ empid);
			System.out.println("Name ="+ name);
			System.out.println("Dept ="+ dept);
			System.out.println("Salary ="+ salary);
			System.out.println("Address ="+ address);
		}
		
		

	}
