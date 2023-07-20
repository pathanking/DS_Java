package com.srkr.oop;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		
		customer1.acno = 1122;
		customer1.name = "sai surya";
		customer1.balance = 2500;
		
		customer1.showMyProfile();
		
		customer1.deposit(700);
		
		customer1.showMyProfile();
		
		customer1.withdraw(200);
		
		customer1.showMyProfile();
	}
}
