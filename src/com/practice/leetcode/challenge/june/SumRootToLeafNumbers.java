package com.practice.leetcode.challenge.june;

import java.util.concurrent.atomic.AtomicInteger;

public class SumRootToLeafNumbers {
	public int sumNumbers(TreeNode root) {
        AtomicInteger sum = new AtomicInteger(0);
        int currentSum = 0;
        calculate(root,sum,currentSum);
        return sum.get();
    }

	private void calculate(TreeNode root, AtomicInteger sum, int currentSum) {

		if(root == null){
			return;
		}
		currentSum = currentSum*10+root.val;
        if(root.left ==null && root.right == null){
            sum.set(sum.get()+currentSum);
        }
		calculate(root.left, sum, currentSum);
        calculate(root.right, sum, currentSum);    
		
	}
}