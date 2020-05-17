package com.practice.sujoy.dp;

import java.util.Arrays;

public class KnapsacPreoblem {

	public static void main(String[] args) {

		int wt[]={10,20,30};
		int val[]={60,100,120};
		int maxWt=40;
		System.out.println(knapsacProb(wt,val,maxWt));
	}

	private static int knapsacProb(int[] wt, int[] val, int maxWt) {
		int matrix[][] = new int[wt.length+1][(maxWt+1)];
		for(int i=0;i<wt.length+1;i++){
			for(int j=0;j<maxWt+1;j++){
				if(i==0||j==0){
					matrix[i][j]=0;
					continue;
				}
				if(j-wt[i-1]>=0){
					matrix[i][j]=Math.max(matrix[i-1][j], val[i-1]+matrix[i-1][j-wt[i-1]]);
				}
				else{
					matrix[i][j]=matrix[i-1][j];
				}
			}
		}
		System.out.println(Arrays.asList(matrix));
		return matrix[wt.length][maxWt];
	}

}
