package com.practice.sujoy.tree;

public class MirrorImage {
	public static void main(String[] args) {
		Node root = new Node(1);
		BinaryTree tree = new BinaryTree();
		tree.root=root;
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
//		tree.root.right.right=new Node(6);
//		tree.root.right.left=new Node(7);
		tree.print();
		
		tree.root = mirrorImage(root);
		tree.print();
	}

	private static Node mirrorImage(Node root) {
		if(root == null)
			return null;
		Node newNode = new Node(root.value);
		newNode.left = mirrorImage( root.right);
		newNode.right = mirrorImage( root.left);
		return newNode;
	}
}
