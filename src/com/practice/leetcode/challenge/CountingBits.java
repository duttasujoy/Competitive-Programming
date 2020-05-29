package com.practice.leetcode.challenge;

public class CountingBits {

	public static void main(String[] args) {

	}
	public int[] countBits(int num) {
		int result[] = new int[num+1];
		result[0]=0;
		for(int i=1;i<=num;i++){
			if(i%2==0){
				result[i]=result[i/2];
			}
			else{
				result[i]=result[i/2]+1;
			}
		}
		return result;
	}

}
