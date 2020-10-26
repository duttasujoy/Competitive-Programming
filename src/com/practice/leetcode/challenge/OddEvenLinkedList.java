package com.practice.leetcode.challenge;

public class OddEvenLinkedList {

	public static void main(String[] args) {
		ListNode linkedList = new ListNode(1,
				new ListNode(2,
						new ListNode(3,
								new ListNode(4,
										new ListNode(5,
												new ListNode(6,
														new ListNode(7,
																new ListNode(8))))))));
		OddEvenLinkedList obj = new OddEvenLinkedList();
		obj.printLinkedList(linkedList);
		linkedList = obj.oddEvenList(linkedList);
		obj.printLinkedList(linkedList);
	}
	private void printLinkedList(ListNode linkedList) {
		ListNode head = linkedList;
		while(head!=null){
			System.out.print(head.val+" ->");
			head= head.next;
		}
		System.out.println();
	}
	public ListNode oddEvenList(ListNode head) {
		if(head==null || head.next==null){
			return head;
		}
		ListNode odd = head;
		ListNode even = head.next;
		int counter = 3;
		helper(odd,even,counter ,even.next);
		while(odd.next!= null){
			odd = odd.next;
		}
		odd.next = even;
		return head;
	}
	private void helper(ListNode odd, ListNode even, int counter, ListNode node) {
		if(node == null){
			odd.next=null;
			even.next=null;		
			return;
		}
		if(counter%2 ==0){
			even.next= node;
			even=even.next;
		}
		else{
			odd.next = node;
			odd=odd.next;
		}
		helper(odd,even,counter+1,node.next);
	}
}

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
