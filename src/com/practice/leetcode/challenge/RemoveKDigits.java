package com.practice.leetcode.challenge;

import java.util.Stack;

public class RemoveKDigits {

	public static void main(String[] args) {
		String num = "36099923508";
		int k = 2;
		RemoveKDigits obj = new RemoveKDigits();
		System.out.println(obj.removeKdigits(num, k));
	}
	public String removeKdigits(String num, int k) {
		//1432219	3
		if(k==0){
			return num;
		}
        if(k==num.length()){
            return "0";
        }
		Stack<Character> st = new Stack<>();
		for(Character c:num.toCharArray()){
			while(!st.isEmpty() && st.peek()>c && k>0){
				st.pop();
				k--;
			}
			st.push(c);
		}
		while(k-->0){
			st.pop();
		}
		StringBuilder sb = new StringBuilder();
		while(!st.isEmpty()){
			sb.append(st.pop());
		}
		sb.reverse();
		while(sb.length()>1 && sb.charAt(0)=='0'){
			sb.deleteCharAt(0);
		}
		return sb.toString();
	}
}
