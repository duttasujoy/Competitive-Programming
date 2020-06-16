package com.practice.leetcode.challenge.june;
public class SearchinaBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(root.val ==val){
            return root;
        }
        TreeNode left = searchBST(root.left,val);
        if(left != null){
            return left;
        }
        return searchBST(root.right,val);
    }
}