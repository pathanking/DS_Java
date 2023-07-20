package com.srkr.ds.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] numbers = { 9, 7, 2, 4, 6, 11, 3, 22 };

		System.out.println("--- Original Data ---");
		System.out.println(Arrays.toString(numbers));  //import Arrays class from java.util package
 
		sort(numbers);
		
		System.out.println("--- Sorted Data ---");
		System.out.println(Arrays.toString(numbers));
	}

	static void sort(int[] numbers) {
		int n = numbers.length;
		
		for(int i= 1; i < n ; i++) {
			int key = numbers[i]; 	
			
			int j = i-1;
			while((j >= 0) && numbers[j] > key) { 
 				numbers[j+1]  = numbers[j];
 				j--;
			}
			numbers[j+1] = key;
		}
	}
}