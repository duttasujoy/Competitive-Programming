package com.practice.leetcode.challenge.july;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
	public static void main(String[] args) {
		BinaryTreeZigzagLevelOrderTraversal obj = new BinaryTreeZigzagLevelOrderTraversal();
		TreeNode root = new TreeNode(3,new TreeNode(9),new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		System.out.println(obj.zigzagLevelOrder(root ));
	}
        
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

		if(root == null){
			return Collections.EMPTY_LIST;
		}
		Queue<TreeNode> qu = new LinkedList<>();
		List<List<Integer>> result = new ArrayList<>();
		boolean leftToRight=true;
		qu.add(root);
		while(!qu.isEmpty()){
			int k=qu.size();
			List<Integer> list = new ArrayList<>();
			for(int i=0;i<k;i++){
				TreeNode node = qu.poll();
				list.add(node.val);
				System.out.println(String.format("node:%d list:%s",node.val,list));
				if(node.left != null) qu.add(node.left);
				if(node.right != null) qu.add(node.right);
			}
			if(!leftToRight){
				Collections.reverse(list);
			}
			result.add(list);
			leftToRight = !leftToRight;
		}
		return result; 
	}
}