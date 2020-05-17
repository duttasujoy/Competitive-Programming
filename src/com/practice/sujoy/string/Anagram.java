package com.practice.sujoy.string;

public class Anagram {

	public static void main(String[] args) {

		String a = "cde";
		String b = "abc";
		int c = makeAnagram(a,b);
	}

	private static int makeAnagram(String a, String b) {
		
		int first[] = new int[26];
		int last[] = new int[26];
		int deletionCount =0;
		for(char c:a.toCharArray()){
			int position = (int)c-(int)'a';
			first[position]++;
		}
		for(char c:b.toCharArray()){
			int position = (int)c-(int)'a';
			last[position]++;
		}
		for(int i=0;i<26;i++){
			int diff = Math.abs(first[i]-last[i]);
			deletionCount += diff;
		}
		System.out.println(deletionCount);
		return deletionCount;
	}

}
