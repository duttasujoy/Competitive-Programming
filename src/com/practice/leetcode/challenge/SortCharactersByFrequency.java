package com.practice.leetcode.challenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		SortCharactersByFrequency obj = new SortCharactersByFrequency();
		String s = "cccaaa";
		System.out.println(obj.frequencySort(s ));
	}

	@SuppressWarnings("rawtypes")
	public String frequencySort(String s) {
		StringBuilder result = new StringBuilder();
		Map<Character,Integer> map = new HashMap<>();
		int maxCount = 0;
		for(char c: s.toCharArray()){
			Integer count = map.getOrDefault(c, 0)+1;
			map.put(c, count );
			maxCount = maxCount<count?count:maxCount;
		}
		List<Character>[] list = new List[maxCount+1];
		for(Character ch: map.keySet()){
			int value = map.get(ch);
			List chList = list[value];
			if(chList == null){
				chList = new ArrayList<>();
			}
			chList.add(ch);
			list[value] = chList;
		}
		for(int i = maxCount;i>0;i--){
			List<Character> li = list[i];
			final int x =i;
			if(li != null){
				li.stream().forEach(b -> append(result,b,x));
			}
		}
		return result.toString();
	}

	private Object append(StringBuilder result, Character b, int i) {
		while(i-->0){
			result.append(b);
		}
		return null;
	}
}
