package com.practice.leetcode.challenge;

public class MaximumSumCircularSubarray {

	public static void main(String[] args) {

		int A[]={5,-3,5};
		MaximumSumCircularSubarray obj = new MaximumSumCircularSubarray();
		System.out.println(obj.maxSubarraySumCircular(A));
	}
	public int maxSubarraySumCircular(int[] A) {
		int max =Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int totalSum = 0;
		int currMax=0;
		int currMin=0;
		for(int item:A){
			currMax +=item;
			max = Math.max(max, currMax);
			currMax = Math.max(currMax, 0);
			
			currMin += item;
			min = Math.min(min, currMin);
			currMin = Math.min(currMin, 0);
			
			totalSum+=item;
		}
		if(max<0){
			return max;
		}
		
		return Math.max(max, totalSum-min);
	}
}
