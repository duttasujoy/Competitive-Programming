package com.practice.sujoy.linklist;

public class RotateList {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);
		list.display();
		System.out.println();
		list.head = rotateList(list.head,1);
		list.display();
	}

	private static Node rotateList(Node head, int i) {

		if(head == null){
			System.out.println("List is empty");
		}
		Node start = head;
		Node prev = head;
		Node current = head;
		Node firstPart = head;
		while(i-->0){
			prev = current;
			current = current.next;
		}
		firstPart = current;
		prev.next = null;
		while(current.next!= null){
			current = current.next;
		}
		current.next = start;
		return firstPart;
	}

}
