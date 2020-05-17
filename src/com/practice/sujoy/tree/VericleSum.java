package com.practice.sujoy.tree;

import java.util.HashMap;
import java.util.Map;

public class VericleSum {

	static Map<Integer,Integer> map ;
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		map = new HashMap<>();
//		int[] a = {1,2,3,4,5,6,7};
//		Arrays.asList(a).stream().forEach(value -> tree.add(value));
		Node root = new Node(1);
		tree.root=root;
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.right=new Node(6);
		tree.root.right.left=new Node(7);
		tree.print();
		traversePreOrder(root,0);
		System.out.println(map);
	}

	private static void traversePreOrder(Node root,int degree) {

		if(root != null){
			if(map.containsKey(degree)){
				map.put(degree, map.get(degree)+root.value);
			}
			else{
				map.put(degree, root.value);
			}
			System.out.println(root.value + " "+ degree);
			traversePreOrder(root.left, degree-1);
			traversePreOrder(root.right,degree+1);
		}
	}
	

}
