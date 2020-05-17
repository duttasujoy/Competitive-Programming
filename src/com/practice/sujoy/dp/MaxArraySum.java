package com.practice.sujoy.dp;

public class MaxArraySum {

	public static void main(String[] args) {
		int arr[] = {5,  5, 10, 40, 50, 35};
		int sum = maxSumFromArray(arr);
		System.out.println(sum);

	}

	private static int maxSumFromArray(int[] arr) {
		int x=0,y=0,z;
		for(int a :arr){
			z = Math.max(x, y);
			x=a+y;
			y=z;
		}	
		return Math.max(x, y);
	}

}
