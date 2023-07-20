package com.srkr.basics;

import java.util.Scanner;

public class ConditionalsDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your Age >>>");

		int age = scanner.nextInt();

		System.out.println("Age : " + age);
		
		if(age > 18)
			System.out.println("Join the Party!");
		else
			System.err.println("Under Age!!");
	}
}