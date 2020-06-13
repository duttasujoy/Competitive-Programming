package com.practice.leetcode.challenge.june;

import java.util.HashMap;
import java.util.Random;

class RandomizedSet {

    private HashMap<Integer,Integer> map;
	private int[] arr;
	private int maxIndex =-1;
	private Random rand;

	public static void main(String[] args) {
		RandomizedSet obj = new RandomizedSet();
		System.out.println(obj.insert(1));
		System.out.println(obj.remove(2));
		System.out.println(obj.insert(2));
		System.out.println(obj.getRandom());
		System.out.println(obj.remove(1));
		System.out.println(obj.insert(2));
		System.out.println(obj.getRandom());
	}
	public RandomizedSet() {
        map = new HashMap<>();
        arr = new int[10000];
        rand = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)){
        	return false;
        }
        arr[++maxIndex] = val;
        map.put(val, maxIndex);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)){
        	return false;
        }
        Integer index = map.get(val);
        int lastVal = arr[maxIndex--];
        arr[index] = lastVal;
        map.put(lastVal, index);
        map.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
    	int random = rand.nextInt(maxIndex+1)  ;
    	System.out.println("rand ="+random);
    	return arr[random];
    }
}