package com.srkr.basics;

import java.util.Scanner;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		String dayName = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Day Number [1-7]");
		int num = scanner.nextInt();

		switch (num) {
			case 1:	dayName = "Monday"; break;
			case 2:	dayName= "Tuesday"; break;
			case 3:	dayName = "Wednesday"; break;
			case 4:	dayName = "Thursday"; break;
			case 5:	dayName = "Friday"; break;
			case 6:	dayName = "Saturday"; break;
			case 7:	dayName = "Sunday"; break;
			default: dayName = "Invalid Input"; break;
		}
		System.out.println(dayName);
	}
}
