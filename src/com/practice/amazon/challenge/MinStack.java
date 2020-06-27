package com.practice.amazon.challenge;

import java.util.Stack;

public class MinStack {

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		minStack.getMin();   
		minStack.pop();
		minStack.top();      
		minStack.getMin();  
	}

	Stack<Integer> s = new Stack<>();
	int min = Integer.MAX_VALUE;
	/** initialize your data structure here. */
	public MinStack() {

	}

	public void push(int x) {
		if(x<=min)
		{
			s.push(min);
			min=x;

		}
		s.push(x);
	}

	public void pop() {
		if(s.pop() == min) min = s.pop();

	}

	public int top() {

		return s.peek();
	}

	public int getMin() {
		return min;

	}
}