package com.practice.sujoy.tree;

public class AVLTree /*extends BinaryTree*/{

	public static void main(String[] args) {
		Node root = new Node(3);
		BinaryTree tree = new BinaryTree();
		tree.root = root;
		insert(root,2);
		insert(root,4);
		insert(root,5);
		insert(root,6);
		tree.print();
	}

	private static Node insert(Node root, int val) {
		if(root == null){
			root = new Node(val);
			return root;
		}
		if(root.value>val){
			root.left = insert(root.left,val);
		}
		else{
			root.right = insert(root.right,val);
		}
		int balanceFactor = height(root.left)-height(root.right);
		if(balanceFactor ==1||balanceFactor ==0||balanceFactor ==-1){
			return root;
		}
		if(balanceFactor <0){
			root = rightRotation(root);
		}
		else{
			root = leftRotation(root);
		}
		return root;
	}

	private static Node leftRotation(Node root) {
		Node temp = root.left;
		temp.right = root;
		root.left = null;
		return temp;
	}

	private static Node rightRotation(Node root) {
		Node temp = root.right;
		temp.left = root;
		root.right = null;
		return temp;
	}

	private static int height(Node node) {
		if(node ==null){
			return 0;
		}
		int left = height(node.left);
		int right = height(node.right);
		return Math.max(left, right)+1;
	}

}
