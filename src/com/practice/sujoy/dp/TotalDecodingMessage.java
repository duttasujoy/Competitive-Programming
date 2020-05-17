package com.practice.sujoy.dp;

import java.util.HashSet;

public class TotalDecodingMessage {

	private static HashSet<String> set;

	public static void main(String[] args) {
		String n = "123";
		set = new HashSet<>();
		findTotalDecodeMessage(n);
		System.out.println(set);
	}

	private static String findTotalDecodeMessage(String n) {
		if(n.equals("")){
			return n;
		}
		String result = "";
		for(int i=1;i<=2&& n.length()>=i;i++){
			String snippet = n.substring(0,i);
			result = isValid(snippet) + findTotalDecodeMessage(n.substring(i));
			set.add(result);
		}
		return result;
	}

	private static String isValid(String snippet) {

		if(snippet.equals(""))
			return snippet;
		return Integer.parseInt(snippet) <27?(char)(Integer.parseInt(snippet) + 'a'-1)+"":"";
	}

}
