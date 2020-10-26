package com.practice.sujoy.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
////		String s = "{)[](}]}]}))}(())(";
//		String s = sc.nextLine();
//		System.out.println(isBalanced(s));
		String s = "()()((";
		System.out.println(isBalanced(s, 0, ')'));
		byte a = 1;
	    int x = 1;
	    while(a< 344 ){
	      a+=2;
	      x+=3;
	    }
	    x +=a;
	    System.out.print(x);

	}

	private static String isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c:s.toCharArray()){
			if(c == '{'||c == '['||c=='('){
				stack.push(c);
				continue;
			}
			if(stack.isEmpty()){
				return "NO";
			}
			char ch = stack.pop();
			if(c!=findAlt(ch)){
				return "NO";
			}
		}
		return "YES";
	}
	
	private static String isBalanced(String s,int pos,char c) {
		if(pos >s.length()-1){
			return "NO";
		}
		if(s.charAt(pos)!=c){
			return isBalanced(s, pos+1, ')');
		}
		
		return isBalanced(s, pos+2, ')');
	}

	private static char findAlt(char ch) {
		switch(ch){
		case '[':
			return ']';
		case '{':
			return '}';
		case '(':
			return ')';
		}
		return 0;
	}

}
