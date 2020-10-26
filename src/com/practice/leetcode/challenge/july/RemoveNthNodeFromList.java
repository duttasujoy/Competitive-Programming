package com.practice.leetcode.challenge.july;

  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	@Override
	public String toString() {
		return  val + ",-> " + next ;
	}
     
 }
public class RemoveNthNodeFromList {
	public static void main(String[] args) {
		RemoveNthNodeFromList obj = new RemoveNthNodeFromList();
		ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
//		ListNode head = new ListNode(1,new ListNode(2));
		int n =2;
		System.out.println(obj.removeNthFromEnd(head, n ));
	}
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next== null){
            return null;
        }
        ListNode root = head;
        ListNode prev = head;
        for(int i = 0;i<n;i++){
        	if(head.next == null){
        		if(i==n-1){
        			root=root.next;
        		}
        		return root;
        	}
        	head = head.next;
        }
        while(head.next !=null){
            prev = prev.next;
            head = head.next;
        }
        prev.next = prev.next.next;
       return root; 
    }
}