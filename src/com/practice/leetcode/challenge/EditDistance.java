package com.practice.leetcode.challenge;

public class EditDistance {

	public static void main(String[] args) {
		EditDistance obj = new EditDistance();
		String word1 = "abc";
		String word2 = "bcc";
		System.out.println(obj.minDistance(word1, word2));

	}
	public int minDistance(String word1, String word2) {
		int m = word1.length();
		int n = word2.length();
		if(m==0||n==0){
			return Math.max(m, n);
		}
		int result[][] = new int[m+1][n+1];
		for(int i=0;i<=m;i++){
			for(int j=0;j<=n;j++){
				if(i==0){
					result[i][j]=j;
					continue;
				}
				if(j==0){
					result[i][j]=i;
					continue;
				}
				if(word1.charAt(i-1)==word2.charAt(j-1)){
					result[i][j]=result[i-1][j-1];
					continue;
				}
				result[i][j] = Math.min(result[i][j-1], Math.min(result[i-1][j], result[i-1][j-1])) + 1;
			}
		}
		return result[m][n];
	}
}
