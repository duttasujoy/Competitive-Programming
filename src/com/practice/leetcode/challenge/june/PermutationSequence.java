package com.practice.leetcode.challenge.june;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermutationSequence {
	public static void main(String[] args) {
		PermutationSequence obj = new PermutationSequence();
		int n =3;
		int k =5;
		System.out.println(obj.getPermutation(n, k));
	}
	Map<Integer,Integer> factValue;
    public String getPermutation(int n, int k) {
    	if(n==1){
    		return n+"";
    	}
    	calculateFactValue();
    	List<Integer> digit = new ArrayList<>();
        String result ="";
        for(int i=0;i<n;i++){
        	digit.add(i+1);
        }
        for(int i=1;i<n;i++){
        	int index = k/factValue.get(n-i);
        	if(k%factValue.get(n-i)==0){
        		index--;
        	}
        	result +=digit.get(index);
        	digit.remove(index);
        	k-=factValue.get(n-i)*index;
        }
		return result+digit.get(0);
    }
	private void calculateFactValue() {

		factValue = new HashMap<>();
		factValue.put(1, 1);
		int prev =1;
		for(int i =2;i<10;i++){
			prev *=i;
			factValue.put(i, prev);
		}
	}
}