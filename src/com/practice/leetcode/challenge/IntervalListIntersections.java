package com.practice.leetcode.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalListIntersections {

	public static void main(String[] args) {

		IntervalListIntersections obj = new IntervalListIntersections();
		int[][] B = {{1,5},{8,12},{15,24},{25,26}};
		int[][] A = {{0,2},{5,10},{13,23},{24,25}};
		print(obj.intervalIntersection(A, B));
	}
	private static void print(int[][] intervalIntersection) {

		for(int []a:intervalIntersection){
			System.out.println(Arrays.toString(a));
		}
	}
	public int[][] intervalIntersection(int[][] A, int[][] B) {
		int i=0,j=0,k=0;
		List<List<Integer>> resultList = new ArrayList<>();
		while(i<A.length&&j<B.length){
			
			int s1 = A[i][0];
			int s2 = B[j][0];
			int e1 = A[i][1];
			int e2 = B[j][1];
			if(e1>=s2&&e2>=s1){
				List<Integer> list = new ArrayList<>();
				list.add(Math.max(s1, s2));
				list.add(Math.min(e1, e2));
				resultList.add(list);
			}
			if(e2>e1){
				i++;
			}
			else{
				j++;
			}
		}
		int result [][] = new int [resultList.size()][2];
		for(List<Integer>list:resultList){
			result[k][0] = list.get(0);
			result[k][1] = list.get(1);
			k++;
		}
		return result;
	}
}
