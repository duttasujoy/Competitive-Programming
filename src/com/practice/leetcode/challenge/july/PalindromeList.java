package com.practice.leetcode.challenge.july;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class PalindromeList {
	public static void main(String[] args) {
		PalindromeList obj = new PalindromeList();
		ListNode head = new ListNode(0,new ListNode(0));
		System.out.println(obj.isPalindrome(head ));
	}
    public boolean isPalindrome(ListNode head) {
        if(head == null||head.next==null){
            return true;
        }
        ListNode curr = head;
        int length =0;
        while(curr != null){
            length++;
            curr = curr.next;
        }
        curr = head;
        int i=0;
        while(i<length/2){
            curr = curr.next;
            i++;
        }
        curr = reverseList(curr);
        while(head != null&&curr != null){
            if(head.val != curr.val){
                return false;
            }
            head = head.next;
            curr = curr.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode rest = reverseList(head.next);
        head.next.next = head;
        head.next=null;
        return rest;
    }
}