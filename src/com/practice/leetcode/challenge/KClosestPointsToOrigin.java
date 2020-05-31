package com.practice.leetcode.challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class KClosestPointsToOrigin {

	public static void main(String[] args) {
		KClosestPointsToOrigin obj = new KClosestPointsToOrigin();
		int[][] points = {{1,3},{-2,-2}};
		int K = 1;
		print(obj.kClosest(points, K));
	}
	private static void print(int[][] kClosest) {
		for(int a[]:kClosest){
			System.out.println(Arrays.toString(a));
		}
	}
	public int[][] kClosest(int[][] points, int K) {
		int result[][] = new int[K][2];
		PriorityQueue<List<Integer>> list = new PriorityQueue<>(new Comparator<List<Integer>>() {

			@Override
			public int compare(List<Integer> o1, List<Integer> o2) {
				return o1.get(0)-o2.get(0);
			}
		});
		for(int i=0;i<points.length;i++){
			int x = points[i][0];
			int y = points[i][1];
			int dist = x*x+y*y;
			list.add(Arrays.asList(dist,x,y));
		}
		for(int i=0;i<K;i++){
			List<Integer> top = list.poll();
			result[i][0]=top.get(1);
			result[i][1]=top.get(2);
		}
		return result;
	}
}