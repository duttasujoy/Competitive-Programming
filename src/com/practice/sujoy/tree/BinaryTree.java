package com.practice.sujoy.tree;
public class BinaryTree {
 
	static final int COUNT = 3;
    Node root;
    
    public void add(int value) {
        root = addRecursive(root, value);
    }
    
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
     
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
     
        return current;
    }
    
    static void print2DUtil(Node root, int space)  
    {  
        // Base case  
        if (root == null)  
            return;  
      
        // Increase distance between levels  
        space += COUNT;  
      
        // Process right child first  
        print2DUtil(root.right, space);  
      
        // Print current node after space  
        // count  
        System.out.print("\n");  
        for (int i = COUNT; i < space; i++)  
            System.out.print(" ");  
        System.out.print(root.value + "\n");  
      
        // Process left child  
        print2DUtil(root.left, space);  
    }  
      
    // Wrapper over print2DUtil()  
    public void print()  
    {  
        // Pass initial space count as 0  
        print2DUtil(root, 0);  
    } 
    
    int height(Node root) 
    { 
        if (root == null) 
           return 0; 
        else
        { 
            /* compute  height of each subtree */
            int lheight = height(root.left); 
            int rheight = height(root.right); 
              
            /* use the larger one */
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
    } 
}