package com.practice.sujoy.dp;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindMinCandies {

	public static void main(String[] args) {
		int marks[] = {2,4,2,6,1,7,8,9,2,1};
		int count = findMinCandies(marks);
		System.out.println(count);
	}

	private static int findMinCandies(int[] marks) {
		int i = 0,sum =0;
		int candy[] = new int[marks.length]; 
		candy[i++] = 1;
		for(;i<marks.length;i++){
			if(marks[i]>marks[i-1]){
				candy[i] = candy[i-1]+1;
			}
			else{
				candy[i]= 1;
			}
		}
		sum = candy[i-1];
		for(i=i-2;i>=0;i--){
			if(marks[i]>marks[i+1] && candy[i] < candy[i+1]+1){
				candy[i] = candy[i+1]+1;
			}
			sum+=candy[i];
		}
		return sum;
	}

}
