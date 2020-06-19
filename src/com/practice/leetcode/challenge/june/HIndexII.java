package com.practice.leetcode.challenge.june;
public class HIndexII {
	public int hIndex(int[] citations) {
		int n = citations.length;
		int low =0,high = n-1,mid;
		while(high >=low){
			mid = low +(high -low)/2;
			if(citations[mid] == n-mid){
				return citations[mid];
			}
			else if(citations[mid]>n-mid){
				high = mid -1;
			}
			else{
				low = mid+1;
			}
		}
		return n-low; 
	}
}