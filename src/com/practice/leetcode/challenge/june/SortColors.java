package com.practice.leetcode.challenge.june;

import java.util.Arrays;

public class SortColors
{
	public static void main(String[] args) {
		SortColors obj = new SortColors();
		int[] nums = {2,0,1};
		obj.sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
    public void sortColors(int[] nums) {
        int red =0;
        int white =0;
        int blue =nums.length-1;
        
        while(white<=blue){
        	if(nums[white]==0){
        		swap(nums,white,red);
        		red++;
        		white++;
        	}
        	else if(nums[white]==1){
        		white ++;
        	}
        	else if(nums[white]==2){
        		swap(nums,white,blue);
        		blue --;
        	}
        }
    }

	private void swap(int[] nums, int white, int red) {
		int temp = nums[white];
		nums[white] = nums[red];
		nums[red] = temp;
	}
}