package com.practice.leetcode.challenge.july;

import java.util.Stack;

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
}


public class FlattenAMultilevelDoublyLinkedList {
    public Node flatten(Node head) {
        if(head == null){
            return head;
        }
       
        Stack<Node> st = new Stack<>();
        Node root = head;
        Node current = head;
        while(current.next != null || !st.isEmpty()||current.child!=null){
            if(current.child!= null){
                if(current.next != null)
                    st.push(current.next);
            
                current.child.prev=current;
                current.next = current.child;
                current.child = null;
                current=current.next;
                continue;
            }
            if(current.next == null){
                current.next=st.pop();
                current.next.prev = current;
                current = current.next;
                continue;
            }
            if(current.child ==null){
                current= current.next;
                continue;
            }
            
        }
        return root;
    }
}