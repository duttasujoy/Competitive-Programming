package com.practice.sujoy.array;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {5,4,3,6,1};
		arr = selectionSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static int[] selectionSort(int[] arr) {
		int tempArr[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			tempArr[i] = findMin(arr);
		}
		return tempArr;
	}

	private static int findMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		int min_pos =0;
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min = arr[i];
				min_pos = i;
			}
		}
		arr[min_pos] = Integer.MAX_VALUE;
		return min;
	}

}
