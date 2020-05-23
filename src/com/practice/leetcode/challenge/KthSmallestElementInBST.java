package com.practice.leetcode.challenge;

import java.util.concurrent.atomic.AtomicInteger;

public class KthSmallestElementInBST {

	public static void main(String[] args) {
		KthSmallestElementInBST obj = new KthSmallestElementInBST();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		root.left.right = new TreeNode(2);
		int k =1;
		System.out.println(obj.kthSmallest(root , k ));

	}
	public int kthSmallest(TreeNode root, int k) {
		AtomicInteger count = new AtomicInteger();
		AtomicInteger result = new AtomicInteger();
		preOrder(root,k,count,result);
		return result.get();
	}
	private void preOrder(TreeNode root, int k, AtomicInteger count, AtomicInteger result) {
		if(root.left != null){
			preOrder(root.left,k,count,result);
		}
		count.getAndIncrement();
		if(k==count.get()){
			result.set(root.val);
			return;
		}
		if(root.right != null){
			preOrder(root.right,k,count,result);
		}
	}
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}