package com.practice.sujoy.dp;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Candies {
	
	public static void main(String[] args) {
		int marks[]={2,4,2,6,1,7,8,9,2,1};
		int totalCandies = findTotalCandies(marks);
		System.out.println(totalCandies);
	}

	private static int findTotalCandies(int[] marks) {
		
		int candy = 1;
		int size=marks.length;
		int candies[]= new int[size];
		for(int i=0;i<marks.length;i++){
			candies[i]=candy;
			if(i==marks.length -1){
				break;
			}
			if(marks[i]<marks[i+1]){
				candy++;
			}
			else{
				candy=1;
			}
		}
		System.out.println(Arrays.toString(marks));
		System.out.println(Arrays.toString(candies));
		for(int i=marks.length-2;i>=0;i--){
			if(marks[i]>marks[i+1]){
				candies[i]=Math.max(candies[i], candies[i+1]+1);
			}
		}
		System.out.println(Arrays.toString(candies));
		return IntStream.of(candies).sum();
	}
}
