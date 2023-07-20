package com.srkr.oop;

public class Customer {
	int acno;
	String name;
	double balance;

	void deposit(int amount) {
		balance += amount;
	}

	void withdraw(int amount) {
		balance -= amount;
	}

	void showMyProfile() {
		System.out.println("Your Profile");
		System.out.println("Account : " + acno);
		System.out.println("Name : " + name);
		System.out.println("Balance : " + balance);
	}
}
