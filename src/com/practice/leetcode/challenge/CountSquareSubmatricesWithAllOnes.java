package com.practice.leetcode.challenge;

public class CountSquareSubmatricesWithAllOnes {

	public static void main(String[] args) {
		CountSquareSubmatricesWithAllOnes obj = new CountSquareSubmatricesWithAllOnes();
		int[][] matrix = {{1,0,1},{1,1,0},{1,1,0}};
		System.out.println(obj.countSquares(matrix ));
	}

	public int countSquares(int[][] matrix) {
		int result [] = new int[matrix[0].length];
 		int count = 0;
 		int top = 0;
 		int left = 0;
		for(int i = 0; i<matrix.length;i ++){
			int topleft =0;
			for(int j =0; j<matrix[0].length;j++){
				if(matrix[i][j]==1){
					top = i==0?0:result[j];
					left = j==0?0:result[j-1];
					result[j] = Math.min(top,Math.min(topleft, left) )+1;
					count +=result[j];
					topleft = top;
				}
				else {
					result[j] = 0;
				}
			}
		}
		return count ;
	}
}
