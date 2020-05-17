package com.practice.sujoy.tree;

public class LowestCommonAnsistor {

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
		int data = findLCA(tree.root,6,7).value;
		tree.print();
		System.out.println(data);

	}

	private static Node findLCA(Node head, int n1, int n2) {
		if(head == null){
			return null;
		}
		if( head.value ==n1 || head.value ==n2){
			return head;
		}
		Node left = findLCA(head.left, n1, n2);
        Node right = findLCA(head.right, n1, n2);
        if(left != null&& right !=null)
        	return head;
        return left!= null?left:right;
	}

}
