package com.practice.leetcode.challenge;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {

	public static void main(String[] args) {
		ContiguousArray obj = new ContiguousArray();
		int[] nums = {0,1};
		System.out.println(obj.findMaxLength(nums ));
	}
	public int findMaxLength(int[] nums) {
		int maxLength =0;
		int sum = 0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++){
			int val = nums[i];
			sum += val==0? -1:val;
			if(sum ==0){
				maxLength = Math.max(maxLength, i+1);
			}
			if(map.containsKey(sum)){
				maxLength=Math.max(maxLength, i-map.get(sum));
			}
			else{
				map.put(sum, i);
			}
		}
		return maxLength;
	}

}
