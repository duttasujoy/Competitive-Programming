package com.practice.leetcode.challenge.june;
public class IsSubsequence {
	public static void main(String[] args) {
		IsSubsequence obj = new IsSubsequence();
		String s = "aaaaaa";
		String t = "bbaaaa";
		System.out.println(obj.isSubsequence(s, t));
	}
	public boolean isSubsequence(String s, String t) {
		int sPtr=0;
		int tPtr=0;
		while(sPtr<s.length()&&tPtr<t.length()){
			if(s.charAt(sPtr)==t.charAt(tPtr)){
				sPtr++;
			}
			tPtr++;
		}
		return sPtr==s.length();
	}
}