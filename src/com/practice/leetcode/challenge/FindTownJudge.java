package com.practice.leetcode.challenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTownJudge {
	public static void main(String[] args) {
		FindTownJudge obj = new FindTownJudge();
		int[][] trust = {};
		System.out.println(obj.findJudge(1, trust));
	}
    public int findJudge(int N, int[][] trust) {
    	if(N==1){
    		return 1;
    	}
        Map<Integer,Set<Integer>> map = new HashMap<>();
        Map<Integer,Integer> count = new HashMap<>();
        for(int i=0;i<trust.length;i++){
            
            Set<Integer> set = map.get(trust[i][0]);
            if(set == null){
            	set = new HashSet<>();
            }
            set.add(trust[i][1]);
            map.put(trust[i][0],set);
        }
        
        for(Set<Integer> list:map.values()){
        	list.stream().forEach(item ->count.put(item, count.getOrDefault(item, 0)+1));
        }
        
        for(Integer key:count.keySet()){
        	if(count.get(key)==N-1 && !map.containsKey(key)){
        		return key;
        	}
        }
        return -1;
    }
}