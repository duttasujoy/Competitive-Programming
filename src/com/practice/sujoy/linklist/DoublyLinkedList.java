package com.practice.sujoy.linklist;

public class DoublyLinkedList {
	
	

	public static void main(String[] args) {
		Node head = null;
		int[] keys = { 6, 4, 8, 7, 9, 2, 1 };
		for(int key:keys)
			head = push(head,key);
		System.out.println(head);
	}

	private static Node push(Node head, int key) {
		Node node = new Node(key);
		node.next = head;
		
		if(head != null){
			head.prev = node;
		}
		head =node;
		
		return head;
	}
	
	

}
