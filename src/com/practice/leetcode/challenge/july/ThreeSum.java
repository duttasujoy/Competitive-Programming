package com.practice.leetcode.challenge.july;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public static void main(String[] args) {
		ThreeSum obj = new ThreeSum();
		int[] nums = {-1, 0, 1, 2, -1, -4};
		System.out.println(obj.threeSum(nums ));
	}
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int start =1,end = nums.length -1;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            int k=nums[i];
            start = i+1;
            while(start<end){
                int sum = k+nums[start]+nums[end];
                if(sum==0){
                	if((i!=0 && nums[i]==nums[i-1])||(nums[start-1]==nums[start] && nums[end-1]==nums[end])){
                		start++;
                		continue;
                	}
                    List<Integer> list = new ArrayList<>();
                    list.add(k);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    result.add(list);
                    start ++;
                    end --;
                }
                else if(sum>0){
                    end--;
                }
                else{
                    start++;
                }
            }
            end = nums.length -1;
        }
        return result;
    }
}