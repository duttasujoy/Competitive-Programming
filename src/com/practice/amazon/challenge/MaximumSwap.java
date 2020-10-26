package com.practice.amazon.challenge;

import java.util.HashMap;
import java.util.Map;

class MaximumSwap {
	public static void main(String[] args) {
		MaximumSwap obj = new MaximumSwap();
		int num = 9973;
		System.out.println(obj.maximumSwap(num ));
	}
    public int maximumSwap(int num) {
    	char []numString = (num+"").toCharArray();
    	Map<Character,Integer> map = new HashMap<>();
    	for(int i=0;i<numString.length;i++){
    		map.put(numString[i], i);
    	}
    	for(int i=0;i<numString.length;i++){
    		for(int j=9;j>0;j--){
    			if(j>numString[i]-'0'&&map.containsKey((char)(j+'0'))){
    				char temp = numString[i];
    				int index = map.get((char)(j+'0'));
    				if(index>i){
    				numString[i] = (char) (j+'0');
    				numString[index] = temp;
    				return Integer.parseInt(String.valueOf(numString));
    				}
    			}
    		}
    	}
    	return Integer.parseInt(String.valueOf(numString));
    }
}