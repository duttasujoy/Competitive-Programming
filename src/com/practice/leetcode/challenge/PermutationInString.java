package com.practice.leetcode.challenge;

public class PermutationInString {

	public static void main(String[] args) {
		String s1 = "ab", s2 = "a";
		PermutationInString obj = new PermutationInString();
		System.out.println(obj.checkInclusion(s2, s1));
	}
	
	public boolean checkInclusion(String s1, String s2) {
		
		if(s2==null||s2.length()==0||s2.length()>s1.length()){
			return false;
		}
		int s1Len = s1.length();
		int s2Len = s2.length();
		
		int s1Arr[] = new int[26];
		int s2Arr[] = new int[26];
		
		for(int i = 0;i<s2.length();i++){
			s2Arr[s2.charAt(i)-'a']++;
			s1Arr[s1.charAt(i)-'a']++;
		}
		
		for(int i = 0;i<s1Len - s2Len;i++){
			if(isSame(s1Arr,s2Arr)){
				return true;
			}
			s1Arr[s1.charAt(i)-'a']--;
			s1Arr[s1.charAt(i+s2Len)-'a']++;
		}
		
		return isSame(s1Arr,s2Arr);    
    }

	private boolean isSame(int[] s1Arr, int[] s2Arr) {

		for(int i=0;i<26;i++){
			if(s1Arr[i]!=s2Arr[i]){
				return false;
			}
		}
		return true;
	}

}
