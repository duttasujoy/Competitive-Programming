package com.practice.leetcode.challenge;

import java.util.Stack;

class StockSpanner {

	public Stack<Integer> prices;
	public Stack<Integer> spans;
	public static void main(String[] args) {
		StockSpanner S = new StockSpanner();
		System.out.println(S.next(100)); 
		System.out.println(S.next(80)) ;
		System.out.println(S.next(60)) ;
		System.out.println(S.next(70));
		System.out.println(S.next(60)) ;
		System.out.println(S.next(75)) ;
		System.out.println(S.next(85));
	}
    public StockSpanner() {
        prices = new Stack<>();
        spans = new Stack<>();
    }
    
    public int next(int price) {
        int count = 1;
        while(!prices.isEmpty() && prices.peek()<price){
        	prices.pop();
        	count +=spans.pop();
        }
        prices.push(price);
        spans.push(count);
		return count ;
    }
}