package com.practice.leetcode.challenge.june;

public class InvertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public TreeNode invertTree(TreeNode root) {
		swap(root);
		return root;
	}

	private void swap(TreeNode root) {
		if(root==null){
			return;
		}
		swap(root.left);
		swap(root.right);
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
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
