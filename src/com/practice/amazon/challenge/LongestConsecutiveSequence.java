package com.practice.amazon.challenge;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int count =0;
        Set<Integer> set = new HashSet<>();
        for(int a:nums)
        set.add(a);
        for(int a:nums){
        	int i =a;
        	int n=0;
        	while(set.contains(i)){
        		i++;
        		n++;
        	}
        	count = Math.max(count, n);
        }
		return count ;
    }
}