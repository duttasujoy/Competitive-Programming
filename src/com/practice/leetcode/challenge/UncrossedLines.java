package com.practice.leetcode.challenge;

public class UncrossedLines {

	public static void main(String[] args) {

		UncrossedLines obj = new UncrossedLines();
		int[] A = {1,4,2};
		int[] B = {1,2,4};
		System.out.println(obj.maxUncrossedLines(A, B));
	}
	public int maxUncrossedLines(int[] A, int[] B) {
		int max = 0;
		int dp [][] = new int [A.length+1][B.length+1];
		for(int i=0;i<A.length+1;i++){
			for(int j=0;j<B.length+1;j++){
				if(i==0||j==0){
					dp[i][j]=0;
					continue;
				}
				if(A[i-1]==B[j-1]){
					dp[i][j]= dp[i-1][j-1]+1;
				}
				else{
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
				max = Math.max(max, dp[i][j]);
				
			}
		}
		return max;
	}
}
