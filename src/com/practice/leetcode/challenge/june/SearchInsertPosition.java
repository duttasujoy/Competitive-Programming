package com.practice.leetcode.challenge.june;
public class SearchInsertPosition {
	public static void main(String[] args) {
		SearchInsertPosition obj = new SearchInsertPosition();
		int[] nums = {1,3,5,6};
		int target = 2;
		System.out.println(obj.searchInsert(nums, target ));
	}
    public int searchInsert(int[] nums, int target) {
        int index=0;
        int start =0,end=nums.length;
        
        if(target <nums[0]){
        	return 0;
        }
        if(target>nums[nums.length-1]){
        	return nums.length;
        }
        while(start<end){
        	int mid = (start+end)/2;
        	if(nums[mid]==target){
        		return mid;
        	}
        	if(nums[mid]>target){
        		end = mid;
        		index = mid;
        	}
        	else{
        		start = mid+1;
        		index = mid+1;
        	}
        }
        
        return index;
    }
}