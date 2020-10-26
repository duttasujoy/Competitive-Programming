package com.practice.leetcode.challenge;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInString {

	public static void main(String[] args) {
		String s="cbaebabacd";
		String p="abc";
		FindAllAnagramsInString obj = new FindAllAnagramsInString();
		System.out.println(obj.findAnagrams(s, p));
	}
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> result = new ArrayList<>();
		if(s==null||s.length()==0||p.length()>s.length()){
			return result;
		}
		
		int sArray[] = new int[26];
		int pArray[] = new int[26];
		
		for(int i=0;i<p.length();i++){
			pArray[p.charAt(i)-'a']++;
			sArray[s.charAt(i)-'a']++;
		}
		for(int i=0;i<s.length()-p.length();i++){
			if(isAnagram(sArray,pArray)){
				result.add(i);
			}
			sArray[s.charAt(i)-'a']--;
			sArray[s.charAt(i+p.length())-'a']++;
		}
		
		if(isAnagram(sArray, pArray)){
			result.add(s.length()-p.length());
		}
		return result;
    }
	private boolean isAnagram(int[] sArray, int[] pArray) {

		for(int i=0;i<26;i++){
			if(sArray[i]!=pArray[i]){
				return false;
			}
		}
		return true;
	}
}
