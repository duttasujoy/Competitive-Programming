package com.practice.sujoy.array;

import java.util.Arrays;

public class KLargestElements {

	public static void main(String[] args) {
		int arr[] = {5,4,3,6,1};
		arr = heapSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] heapSort(int[] arr) {
		int heap[] = new int[arr.length];
		int i = 0;
		for(int a:arr){
			heap[i] = a;
			fixHeapAbove(heap,i);
			i++;
		}
		return heap;
	}

	private static void fixHeapAbove(int[] heap, int index) {

		int newValue = heap[index];
		while(index >0 && newValue<heap[getParantIndex(index)]){
				heap[index] = heap[getParantIndex(index)];
				index = getParantIndex(index);
		}
		heap[index]= newValue;		
	}

	private static int getParantIndex(int i) {
		return (i-1)/2;
	}

}
