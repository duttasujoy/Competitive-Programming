package com.practice.sujoy.tree;

public class CloneTree {

	public static void main(String[] args) {

		Node root = new Node(1);
		BinaryTree tree = new BinaryTree();
		tree.root=root;
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.right=new Node(6);
		tree.root.right.left=new Node(7);
		tree.print();

		BinaryTree tree2 = new BinaryTree();
		tree2.root = clone(root);
		tree2.print();
	}

	private static Node clone(Node root) {
		if(root == null)
			return null;
		Node newNode = new Node(root.value);
		newNode.left = clone( root.left);
		newNode.right = clone( root.right);
		return newNode;
	}

}
