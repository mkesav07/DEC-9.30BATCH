package org.tcs.day1.login;

public class Company extends Employee {
	public void cmpId(){
	System.out.println("Company ID is 4455");		
	}
	
	public void cmpName() {
		System.out.println("Company Name is Green Tech");
	}
	
	public static void main(String[]args) {
		Company c = new Company();
		c.cmpId();c.cmpName();
		c.empId();c.empName();
				
	}

}
