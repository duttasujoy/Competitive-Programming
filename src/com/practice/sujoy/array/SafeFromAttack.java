package com.practice.sujoy.array;

import java.util.Scanner;

public class SafeFromAttack {
	
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t=sc.nextInt();
		while(--t>=0){
			int r=sc.nextInt();
			int c=sc.nextInt();
			String arr[] = new String[r];
			for(int i=0;i<r;i++){
				arr[i]=sc.next();
			}
			findSafeSquare(r,c,arr);
		}
	}

	private static void findSafeSquare(int r, int c, String[] arr) {
		int dp[][]= new int[r][c];
		for(int i=0;i<r;i++){
			char arr1[]= arr[i].toCharArray();
			for(int j=0;j<c;j++){
				dp[i][j]=arr1[j]=='n'?1:0;
			}
		}
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(dp[i][j]==0||dp[i][j]==2){
					continue;
				}
				if(j+1<c){
					if(i+2<r){
						dp[i+2][j+1]=dp[i+2][j+1]==1?1:2;
					}
					if(i-2>=0){
						dp[i-2][j+1]=dp[i-2][j+1]==1?1:2;
					}
				}
				if(j+2<c){
					if(i+1<r){
						dp[i+1][j+2]=dp[i+1][j+2]==1?1:2;
					}
					if(i-1>=0){
						dp[i-1][j+2]=dp[i-1][j+2]==1?1:2;
					}
				}
				if(j-1>=0){
					if(i+2<r){
						dp[i+2][j-1]=dp[i+2][j-1]==1?1:2;
					}
					if(i-2>=0){
						dp[i-2][j-1]=dp[i-2][j-1]==1?1:2;
					}
				}
				if(j-2>=0){
					if(i+1<r){
						dp[i+1][j-2]=dp[i+1][j-2]==1?1:2;
					}
					if(i-1>=0){
						dp[i-1][j-2]=dp[i-1][j-2]==1?1:2;
					}
				}
				
			}
		}
		int count = 0;
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(dp[i][j]==0){
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
