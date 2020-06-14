package com.practice.leetcode.challenge.june;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestDivisibleSubset {
	public static void main(String[] args) {
		LargestDivisibleSubset obj = new LargestDivisibleSubset();
		int[] nums = {1,2,3};
		System.out.println(obj.largestDivisibleSubset(nums ));
	}
    public List<Integer> largestDivisibleSubset(int[] nums) {
    	if(nums.length<1){
    		return Collections.emptyList();
    	}
    	if(nums.length<2){
    		return Arrays.asList(nums[0]);
    	}
    	Arrays.sort(nums);
    	int dp[] = new int[nums.length];
    	int max = 0;
    	dp[0]=1;
    	for(int i = 0;i<nums.length;i++){
    		int curr = nums[i];
    		for(int j =0 ;j<i;j++){
    			if(curr%nums[j]==0){
    				dp[i]=Math.max(dp[i], dp[j]+1);
    				max = Math.max(dp[i], max);
    			}
    		}
    	}
    	List<Integer> result = new ArrayList<>();
    	int prev = -1;
    	for(int i =nums.length-1;i>=0;i--){
    		if(dp[i]==max ){
    			if(prev == -1 || prev % nums[i]==0){
	    			result.add(nums[i]);
	    			max--;
	    			prev = nums[i];
    			}
    		}
    	}
		return result;
        
    }
}