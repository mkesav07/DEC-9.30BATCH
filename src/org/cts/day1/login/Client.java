package org.cts.day1.login;

import org.tcs.day1.login.Company;

public class Client extends Company{
	public void clientId() {
		System.out.println("The Client ID is 8899");
	}
	public void clientName() {
		System.out.println("The Client Name is Verizon");
	}

	public static void main(String[]args) {
		Client c = new Client();
		c.clientId();c.clientName();
		c.cmpId();c.cmpName();
		c.empId();c.empName();
		
	}
}
