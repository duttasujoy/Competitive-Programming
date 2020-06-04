package com.practice.leetcode.challenge.june;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling {
	public static void main(String[] args) {
		TwoCityScheduling obj = new TwoCityScheduling();
		int[][] costs = {{518,518},{71,971},{121,862},{967,607},{138,754},{513,337},{499,873},{337,387},{647,917},{76,417}};
		System.out.println(obj.twoCitySchedCost(costs ));
	}
    public int twoCitySchedCost(int[][] costs) {
        int totalCost =0;
        Arrays.sort(costs, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return -(Math.abs(o1[0]-o1[1])-Math.abs(o2[0]-o2[1]));
			}
		});
        int cityA=0,cityB=0;
        for(int a[]:costs){
        	if(a[0]<a[1] && cityA<costs.length/2||cityB>=costs.length/2){
        		totalCost+=a[0];
        		cityA++;
        	}
        	else{
        		totalCost+=a[1];
        		cityB++;
        	}
        }
        return totalCost;
    }
}