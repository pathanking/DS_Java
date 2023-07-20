package com.srkr.basics;
public class LoopDemo {
	public static void main(String[] args) {
		System.err.println("---------- FOR LOOP -----------");
		for (int i = 1; i <= 10; i++)
			System.out.println(i);

		System.err.println("---------- WHILE LOOP -----------");
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		System.err.println("------- DO WHILE LOOP --------");
		int k = 1;
		do {
			System.out.println(k);
			k++;
		} while (k <= 10);

		System.err.println("----------- FOREACH LOOP -----------");
		for (int x : new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 })
			System.out.println(x);
	}
}