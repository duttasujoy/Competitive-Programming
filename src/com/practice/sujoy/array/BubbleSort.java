package com.practice.sujoy.array;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = {5,4,3,6,1};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
