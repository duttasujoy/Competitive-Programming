package com.practice.amazon.challenge;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
		LongestIncreasingSubsequence obj = new LongestIncreasingSubsequence();
		int[] nums = {-2,-1};
		System.out.println(obj.lengthOfLIS(nums ));
	}
	public int lengthOfLIS(int[] nums) {
        if(nums ==null || nums.length ==0){
            return 0;
        }
       int dp[] = new int[nums.length];
        int i=1,j=0;
        int max=1;
        Arrays.fill(dp,1);
        while(i<nums.length && j<nums.length)
        {
            if(nums[i]>nums[j]){
                dp[i]=Math.max(dp[i],dp[j]+1);
                max= Math.max(dp[i],max);
            }
            else{
                if(i==j){
                    j=0;
                    i++;
                    continue;
                }
            }
            j++;
        }
        return max;
    }
}