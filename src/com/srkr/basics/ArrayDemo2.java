package com.srkr.basics;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int[] ints = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + ints.length + " Elements");

		for (int i = 0; i < ints.length; i++) {
			ints[i] = sc.nextInt();
		}

		System.out.println("------ ARRAY ELEMENTS ------");
		for (int i = ints.length - 1; i >= 0; i--) {
			System.out.print(ints[i] + "\t");
		}
	}
}