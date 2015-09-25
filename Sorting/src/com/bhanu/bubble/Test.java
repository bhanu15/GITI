package com.bhanu.bubble;

/**
 * in this algorithm , the heaviest elements bubbles to the last of the array so
 * its named as bubble sort algorithm.
 * 
 * @author bhanu
 *
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("Hello World");

		int array[] = new int[] { 1, 8, 9, 4, 5, 323, 2, 10 };
		System.out.println("Before ");
		for (int a : array) {
			System.out.print(" " + a + " ");
		}
		int temp[] = bubbleSort(array);

		System.out.println("After ");
		for (int a : temp) {
			System.out.print(" " + a + " ");
		}
	}

	public static int[] bubbleSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

}
