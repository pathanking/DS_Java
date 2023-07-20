package com.srkr.basics;

import java.util.Scanner;

/**
 * 
 * @author razaa
 *
 */

public class MaxAndMin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 3 numbers:");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (a < b) {
			if (a < c)
				System.out.println("Min : " + a);
			else
				System.out.println("Min : " + c);
		} else {
			if (b < c)
				System.out.println("Min : " + b);
			else
				System.out.println("Min : " + c);
		}

	}

}
