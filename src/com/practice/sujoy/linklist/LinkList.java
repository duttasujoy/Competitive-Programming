package com.practice.sujoy.linklist;

public class LinkList {
	
	public Node head;
	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.addNode(1);
		list.addNode(4);
		list.addNode(3);
		list.display();
		System.out.println();
		list.delete(4);
		list.display();
		System.out.println();
		list.addNode(5);
		list.addNode(6);
		list.display();
		System.out.println();
		list.delete(5);
		list.display();
	}
	
	public void delete(int data) {

		if(head == null){
			System.out.println("List is Empty");
		}
		Node current = head;
		Node prev = head;
		while(current.data != data){
			if(current.next.data == data){
				prev = current;
			}
			current = current.next;
		}
		prev.next = current.next;
	}

	public void display() {

		if(head == null){
			System.out.println("List is empty");
		}
		Node current = head;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}

	public void addNode(int data) {

		if(head == null){
			head = new Node(data);
			return;
		}
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = new Node(data);
	}

}
