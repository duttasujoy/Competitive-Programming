package com.practice.leetcode.challenge;

import java.util.Arrays;

public class FloodFill {

	public static void main(String[] args) {
		int image [][]= {{2,2,2},{2,2,0},{2,0,1}};
		int sr=1;
		int sc=1;
		int newColor=2;
		FloodFill obj = new FloodFill();
		print(obj.floodFill(image, sr, sc, newColor));

	}
	private static void print(int[][] floodFill) {
		 for (int[] row : floodFill) 
	        System.out.println(Arrays.toString(row)); 
	}
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int oldColor = image[sr][sc];
		if(oldColor != newColor){
			helper(image,sr,sc,newColor,oldColor);
		}
		return image;
	}
	private void helper(int[][] image, int sr, int sc, int newColor, int oldColor) {

		if(sr<0||sc<0||sr>=image.length || sc>=image[0].length){
			return ;
		}
		if(image[sr][sc]!=oldColor){
			return;
		}
		image[sr][sc]=newColor;
		helper(image, sr+1, sc, newColor, oldColor);
		helper(image, sr-1, sc, newColor, oldColor);
		helper(image, sr, sc+1, newColor, oldColor);
		helper(image, sr, sc-1, newColor, oldColor);
	}

}
