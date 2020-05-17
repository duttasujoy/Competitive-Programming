package com.practice.sujoy.array;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {

		int arr[] = {4,8,7,6,1,5,9};
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] mergeSort(int[] arr, int begin, int end) {

		int mid = (begin+end)/2;
		if(begin<end){
			mergeSort(arr,begin,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,begin,mid,end);

		}
		return null;
	}

	private static void merge(int[] arr, int begin, int mid, int end) {

		int firstPart = mid-begin +1;
		int lastPart = end-mid;
		int first[] = new int[firstPart];
		int last[] = new int[lastPart];

		for(int i =0 ;i<firstPart;i++){
			first[i] = arr[begin+i];
		}
		for(int j =0 ;j<lastPart;j++){
			last[j] = arr[j+mid+1];
		}
		int i = 0, j = 0; 

		// Initial index of merged subarry array 
		int k = begin; 
		while(i<firstPart && j<lastPart){
			if(first[i]<=last[j]){
				arr[k] = first[i];
				i++;
			}
			else{
				arr[k] = last[j];
				j++;
			}
			k++;
		}
		while (i < firstPart) 
        { 
            arr[k] = first[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < lastPart) 
        { 
            arr[k] = last[j]; 
            j++; 
            k++; 
        } 

		System.out.println(Arrays.toString(last));
		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(arr));
		System.out.println();
	}
}