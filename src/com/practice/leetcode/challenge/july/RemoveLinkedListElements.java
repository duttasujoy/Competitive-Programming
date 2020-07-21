package com.practice.leetcode.challenge.july;
public class RemoveLinkedListElements {
	public static void main(String[] args) {
		RemoveLinkedListElements obj = new RemoveLinkedListElements();
		ListNode head = new ListNode(1, new ListNode(1));
		int val =1;
		System.out.println(obj.removeElements(head , val ));
	}
	public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode current = removeElements(head.next,val);
        if(head.val == val){
            return current;
        }
        head.next = current;
        return head;
    }
}