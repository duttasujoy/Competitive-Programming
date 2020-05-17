package com.practice.sujoy.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SherlockAndValidString {

	public static void main(String[] args) {
		String s = "abcccd";
		System.out.println(isValid(s)?"YES":"NO");
	}

	private static boolean isValid(String s) {
		Map<Character,Integer> map = new HashMap<>();
		for(char c:s.toCharArray()){
			map.put(c, map.containsKey(c)?map.get(c)+1:1);
		}
		Set<Integer> set = new HashSet<>(map.values());
		System.out.println(set);
		
		if(set.size()>2){
			return false;
		}
		Iterator<Integer> it = set.iterator();
		int a=it.next();
		int b=it.next();
		
//		
		return Math.abs(a-b)==1;
	}

}
