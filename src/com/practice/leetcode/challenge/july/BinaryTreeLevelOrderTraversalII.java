package com.practice.leetcode.challenge.july;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTreeLevelOrderTraversalII {
	public static void main(String[] args) {
		BinaryTreeLevelOrderTraversalII obj = new BinaryTreeLevelOrderTraversalII();
		TreeNode root = new TreeNode(3, new TreeNode(9),new TreeNode(20));
		System.out.println(obj.levelOrderBottom(root ));
	}
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root ==null){
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            List<Integer> lavel = new ArrayList<>();
            int n = qu.size();
            for(int i=0;i<n;i++){
                TreeNode temp = qu.poll();
                lavel.add(temp.val);
                if(temp.left !=null){
                    qu.add(temp.left);
                }
                if(temp.right !=null){
                    qu.add(temp.right);
                }    
            }
            result.add(lavel);
        }
        Collections.reverse(result);
        return result;
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