package com.practice.amazon.challenge;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	
	public static void main(String[] args) {
		EvaluateReversePolishNotation obj = new EvaluateReversePolishNotation();
		String[] tokens = {"4","3","-"};
		System.out.println(obj.evalRPN(tokens ));
	}
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int result =0;
        for(String s:tokens){
            if(s.matches("^-?[0-9]*")&&!s.equals("-")){
                st.push(Integer.parseInt(s));
            }
            else{
            	int a=0,b;
            		b =st.pop();
            		a = st.pop();
                result = calculate(a,b,s);
                st.push(result);
            }
        }
		return result;
    }

	private int calculate(int a, int b, String s) {
		switch(s){
			case "+":
				return a+b;
			case "-":
				return a-b;
			case "*":
				return a*b;
			case "/":
				return a/b;
		}
		return 0;
	}
}