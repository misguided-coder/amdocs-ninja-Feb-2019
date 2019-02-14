package com.amdocs.apptrax.srp;

//core banking functionalities only
public class AccountService {

	public void open() {
		System.out.println("Account is opened!!!");
	}

	public void close() {
		System.out.println("Account is closed!!!");
	}

	public void withdraw(long amount) {
		System.out.printf("Amount %s debited from account!!!%n",amount);
	}

	public void deposit(long amount) {
		System.out.printf("Amount %s credited to account!!!%n",amount);
	}
	
}
