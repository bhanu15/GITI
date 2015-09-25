package com.bhanu.insertionSort;

/**
 * this is normal insertion sort algorithm
 * @author bhanu
 *
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("Hello world this is insertion sort");
		int array[] = new int []{1,5,2,9,11,0,-1};
		
		System.out.println("array before swap");
		for(int i : array){
			System.out.print("  "+i+ " ");
		}
		insertinSort(array);
		
		System.out.println("After swap");
		for(int i : array){
			System.out.print("  "+i+ " ");
		}
	}
	
	// here the swiping logic is different.
	public static void insertinSort(int arr[] ){

		for(int i =0 ;i<arr.length -1 ;i++){
			for(int j= i+1 ; j< arr.length ;j++){
				if(arr[i]> arr[j]){
					swap(arr , i , j);
				}
			}
		}
	}
	
	public static void  swap( int arr[] , int i , int j){
		int temp1 = arr[j];
		for( int k = i; k<=j ; k++){
			int temp = arr[k];
			arr[k]  = temp1;
			temp1= temp;
		}
	}
}
