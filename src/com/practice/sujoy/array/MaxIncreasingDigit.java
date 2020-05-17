package com.practice.sujoy.array;

public class MaxIncreasingDigit {

	public static void main(String[] args) {

		int a[] = {1,10,9,6,11,8,13};
		
		System.out.println(calculateMaxIncrSeq(a));
	}

	private static int calculateMaxIncrSeq(int[] a) {

		int count =1;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<i-1;j++){
				if(a[j]>a[i]){
					count++;
				}
			}
		}
		return count;
	}

}
