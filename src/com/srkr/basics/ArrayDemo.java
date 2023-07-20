package com.srkr.basics;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] integers = new int[3];
		integers[0] = 2;
		integers[1] = 5;
		integers[2] = 7;

		// for each int in the array of integers
		for (int i : integers)
			System.out.println(i);

		System.err.println("--------- BYTES ARRAY--------");
		byte[] bytes = { 2, 3, 4, 5, 7 };
		for (byte b : bytes)
			System.out.println(b);

		System.err.println("---------- SHORTS ARRAY ---------");
		short[] shorts = new short[] { 1, 3, 5, 7, 9 };
		for (short s : shorts)
			System.out.println(s);
		
		System.out.println("--------- ARRAY OF ARRAYS -------");
		int[][] multi = {
				{2, 4, 6 }, { 1, 3, 7 }, { 5, 8, 9 } 
		};

		for (int[] ints : multi) {
			for (int i : ints) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}
}