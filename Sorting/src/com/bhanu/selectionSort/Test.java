package com.bhanu.selectionSort;


/**
 * this algorithm works on the comparison of adjacent element . 
 * the lightest element comes to the first index in the firt iteration 
 * itself.  
 * @author bhanu
 */
public class Test {

	public static void main(String[] args) {

		System.out.println("Hello world");
		// array before sorting. 
		int array[] = new int[] { 1, 5, 6, 2, 0, 3 };
		System.out.println("array before sorting");
		for (int i : array) {
			System.out.print(i);
		}
		
		// array after sorting.
		System.out.println("array after sorting");
		selectionSort(array);
		for(int i : array){
			System.out.print(i);
		}
	}

	static void selectionSort(int arr[]) {
		// this is sorting logic here
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
	}

	static void swap(int a[], int i, int j) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
