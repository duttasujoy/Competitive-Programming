package com.practice.leetcode.challenge.july;

import java.util.Arrays;

public class MaxScore {

	public static void main(String[] args) {
		int scores[] = {94,90,92,93,93};
		int sum = maxScore(scores);
		System.out.println(sum);
	}

	private static int maxScore(int[] scores) {
		
		Arrays.sort(scores);
		int min = scores[0];
		int firstDigit = min/10;
		int secondDigit = min%10;
		if(firstDigit != 9){
			firstDigit = 9;
		}
		else{
			secondDigit = 9;
		}
		min = firstDigit *10 +secondDigit;
		scores[0]=min;
		
		return Arrays.stream(scores).sum();
	}
}
