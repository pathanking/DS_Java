package com.srkr.ds.sorting;

import java.util.Arrays;

public class BubbleSort {
	static void sort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) // pass (first,second, ... n-1 passes)
			for (int j = 0; j < n - 1; j++) // comparison & swap
			{
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
	}

	public static void main(String[] args) {

		int[] numbers = { 8, 5, 6, 2, 1, 4, 3 };

		System.out.println("--- Original Data ---");
		System.out.println(Arrays.toString(numbers));

		sort(numbers);
		
		System.out.println("--- Sorted Data ---");
		System.out.println(Arrays.toString(numbers));
	}
}
