package com.practice.sujoy.array;

import java.util.Arrays;

public class ReverseMergeSort {

	public static void main(String[] args) {
		int arr[] = {5,4,3,6,1};
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));

	}

	private static void mergeSort(int[] arr) {
		int begin = 0;
		int end = arr.length-1;
		split(arr,begin,end);
	}

	private static void split(int[] arr, int begin, int end) {
		if(end -begin<2){
			return;
		}
		int mid = (begin+end)/2;
		split(arr,begin,mid );
		split(arr,mid,end);
		merge(arr,begin,mid,end);
	}
	
	private static void merge(int[] arr, int begin, int mid, int end) {
		int temp[] = new int[end - begin];
		int i = begin;
		int j = mid;
		int tempIndex =0;
		while(i<mid &&j<end){
			if(arr[i]>arr[j]){
				temp[tempIndex++]=arr[i];
				i++;
			}
			else{
				temp[tempIndex++]=arr[j];
				j++;
			}
		}
		System.arraycopy(arr, i,arr, begin+tempIndex, mid -i);
		System.arraycopy(temp, 0,arr, begin, tempIndex);
	}


}
