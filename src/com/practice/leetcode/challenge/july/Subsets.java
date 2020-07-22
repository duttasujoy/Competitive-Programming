package com.practice.leetcode.challenge.july;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public static void main(String[] args) {
		Subsets obj = new Subsets();
		int[] nums ={1,2,3};
		System.out.println(obj.subsets(nums ));
	}
    public List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>> result = new ArrayList<>();
    	result.add(new ArrayList<>());
    	for(int n:nums){
			int size  = result.size();
			for(int i=0;i<size;i++){
				List<Integer> subset = new ArrayList<>(result.get(i));
				subset.add(n);
				result.add(subset);
			}
		}
    	return result;
    	
    }
}