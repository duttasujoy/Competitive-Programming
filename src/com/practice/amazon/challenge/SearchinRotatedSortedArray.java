package com.practice.amazon.challenge;
public class SearchinRotatedSortedArray {
	public static void main(String[] args) {
		SearchinRotatedSortedArray obj = new SearchinRotatedSortedArray();
		int[] nums = {1,3};
		int target = 3;
		System.out.println(obj.search(nums, target));
	}
    public int search(int[] nums, int target) {
        if(nums.length==1){
            return nums[0]==target?0:-1;
        }
        int l =0,r=nums.length-1,m = 0;
        while(l<=r){
        	m = (l+r)/2;
        	if(target == nums[m]){
        		return m;
        	}
            if(nums[m]>=nums[l]){
                if(target>=nums[l]&&target<=nums[m]){
                	r=m-1;
                }
                else{
                	l=m+1;
                }
            }
            else {
                if(target>=nums[m]&&target<=nums[r]){
                	l=m+1;
                }
                else{
                	r=m-1;
                }
            }
            
        }
        return -1;
    }
}