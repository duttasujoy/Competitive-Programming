package com.practice.sujoy.linklist;

public class Node {
	int data;
	Node next;
	Node prev;
	public Node(int data) {
		this.data = data;
		next = null;
		prev = null;
	}
	@Override
	public String toString() {
		return prev+" --> " + data ;
	}
}
