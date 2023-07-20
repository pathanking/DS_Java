package com.srkr.ds.sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };

		System.out.print("Original array: ");
		System.out.println(Arrays.toString(arr));

		descSelectionSort(arr);
		System.out.print("Sorted array: DESC Order");
		System.out.println(Arrays.toString(arr));

		ascSelectionSort(arr);
		System.out.print("Sorted array: ASC Order");
		System.out.println(Arrays.toString(arr));

	}

	static void descSelectionSort(int[] arr) { // sorts elements in descending order
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			// Find the max element in the unsorted array
			int maxIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			// Swap the found max element with the first element
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[i];
			arr[i] = temp;
		}
	}

	static void ascSelectionSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) { // Find the minimum element in the unsorted array
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			} // Swap the found minimum element with thefirst element
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

}