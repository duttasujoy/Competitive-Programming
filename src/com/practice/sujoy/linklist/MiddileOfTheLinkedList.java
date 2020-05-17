package com.practice.sujoy.linklist;

public class MiddileOfTheLinkedList {

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
		System.out.println(findOutMid(list));
		
		deleteFromMid(list);
		list.display();
	}

	private static int findOutMid(LinkList list) {

		if(list.head.next == null){
			return 0;
		}
		if(list.head.next.next == null){
			return list.head.next.data;
		}
		Node fast = list.head;
		Node slow = list.head;
		
		while(fast.next!= null && fast.next.next != null){
			fast = fast.next.next;
			slow = slow.next;
		}
		
		return slow.data;
	}
	private static void deleteFromMid(LinkList list) {

		if(list.head.next == null){
			return ;
		}
		Node fast = list.head;
		Node slow = list.head;
		Node prev = list.head;
		
		while(fast.next!= null && fast.next.next != null){
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}
		
		prev.next = slow.next;
	}


}
