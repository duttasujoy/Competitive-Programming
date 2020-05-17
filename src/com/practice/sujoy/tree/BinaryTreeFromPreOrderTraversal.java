package com.practice.sujoy.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class BinaryTreeFromPreOrderTraversal {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList( Arrays.asList(10, 30, 20, 5, 15 ));
		char pos[] = {'N', 'N', 'L', 'L', 'L'};
		int arr[]={10, 30, 20, 5, 15};
		BinaryTree tree = new BinaryTree();
//		tree.root = createTreeFromPreOrderTraversal(a,pos,tree.root);
		tree.root = constructTree(arr, pos, pos.length, tree.root);
		tree.print();
	}

	private static Node createTreeFromPreOrderTraversal(ArrayList<Integer> a, String[] pos, Node root) {
		int index =0;
		return createTree(a,pos,index,root);
	}

	private static Node createTree(ArrayList<Integer> a, String[] pos, int index, Node node) {
		if(index == a.size()){
			return null;
		}
		index ++;
		node = new Node(a.get(index));
		if(Objects.equals(pos[index], "N")){
			node.left= createTree(a, pos, index, node.left);
			node.right= createTree(a, pos, index, node.right);
		}
		return node;
	}
	
	static class Index  
	{ 
	    int index = 0; 
	} 
	   
	    Node root; 
	    static Index myindex = new Index(); 
	   
	    /* A recursive function to create a Binary Tree from given pre[] 
	       preLN[] arrays. The function returns root of tree. index_ptr is used 
	       to update index values in recursive calls. index must be initially 
	       passed as 0 */
	    static Node constructTreeUtil(int pre[], char preLN[], Index index_ptr,  
	                                                     int n, Node temp) 
	    { 
	        // store the current value of index in pre[] 
	        int index = index_ptr.index;  
	   
	        // Base Case: All nodes are constructed 
	        if (index == n) 
	            return null; 
	   
	        // Allocate memory for this node and increment index for 
	        // subsequent recursive calls 
	        temp = new Node(pre[index]); 
	        (index_ptr.index)++; 
	   
	        // If this is an internal node, construct left and right subtrees  
	        // and link the subtrees 
	        if (preLN[index] == 'N')  
	        { 
	            temp.left = constructTreeUtil(pre, preLN, index_ptr, n,  
	                                                               temp.left); 
	            temp.right = constructTreeUtil(pre, preLN, index_ptr, n,  
	                                                               temp.right); 
	        } 
	   
	        return temp; 
	    } 
	   
	    // A wrapper over constructTreeUtil() 
	    static Node constructTree(int pre[], char preLN[], int n, Node node)  
	    { 
	        // Initialize index as 0. Value of index is used in recursion to 
	        // maintain the current index in pre[] and preLN[] arrays. 
	        int index = 0; 
	   
	        return constructTreeUtil(pre, preLN, myindex, n, node); 
	    } 
	   

}
