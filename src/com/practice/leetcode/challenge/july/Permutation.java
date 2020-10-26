package com.practice.leetcode.challenge.july;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Permutation {
	public static void main(String[] args) {
		Permutation obj = new Permutation();
		int[] nums = {1,2,3};
		System.out.println(obj.permute(nums ));
	}
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> perm = new LinkedList<>();
        perm.add(new ArrayList<>());
        int n =nums.length;
        for(int i=0;i<n;i++){
            int k = perm.size();
            for(int j=0;j<k;j++){
                List<Integer> list = perm.poll();
                int z = list.size();
                for(int l =0;l<=z;l++){
                    List<Integer> newPerm = new ArrayList<>(list);
                    newPerm.add(l,nums[i]);
                    if(newPerm.size() == n){
                        result.add(newPerm);
                    }
                    else{
                        perm.add(newPerm);
                    }
                }
            }
        }
        
        return result;
    }
}







