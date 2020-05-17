package com.practice.sujoy.array;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {5,4,3,6,1};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++){
			int key = arr[i];
			int j=0;
			while(key>arr[j]){
				j++;
			}
			for(int k=i;k>j;k--){
				arr[k]=arr[k-1];
			}
			arr[j]=key;
		}
	}

}
