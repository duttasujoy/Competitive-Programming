package com.practice.leetcode.challenge;

import java.util.concurrent.atomic.AtomicInteger;

public class ConstructBSTFromPreorder {

	public static void main(String[] args) {
		ConstructBSTFromPreorder obj = new ConstructBSTFromPreorder();
		int[] preorder = {4,2};
		obj.bstFromPreorder(preorder);
	}
	public TreeNode bstFromPreorder(int[] preorder) {
		TreeNode root = null;
		if(preorder.length==0){
			return root;
		}
		root = new TreeNode(preorder[0]);
		if(preorder.length ==1){
			return root;
		}
		AtomicInteger pos =new AtomicInteger(1);
		helper(root,preorder,pos,Integer.MAX_VALUE,Integer.MIN_VALUE);
		return root;
	}
	private void helper(TreeNode root, int[] preorder, AtomicInteger pos, int maxValue, int minValue) {

		if(pos.get() == preorder.length){
			return;
		}
		int val = preorder[pos.get()];
		if(val>maxValue||val<minValue){
			return;
		}
		if(root.val >val){
			root.left = new TreeNode(val);
			pos.getAndIncrement();
			helper(root.left, preorder, pos, root.val-1, minValue);
		}
		if(pos.get() == preorder.length||preorder[pos.get()]>maxValue||preorder[pos.get()]<minValue){
			return;
		}
		val = preorder[pos.get()];
		root.right = new TreeNode(val);
		pos.incrementAndGet();
		helper(root.right, preorder, pos, maxValue, root.val+1);
		
	}

}
