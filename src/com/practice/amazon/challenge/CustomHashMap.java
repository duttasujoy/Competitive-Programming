package com.practice.amazon.challenge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Stream;

class Pair{
	int key;
	int value;
	
}
public class CustomHashMap{
	
//	public static void main(String[] args) {
//		CustomHashMap map = new CustomHashMap();
//		Map<Integer,Integer> map1 = new HashMap<>();
//		 String s1 = "abc"; 
//		String s2 = s1; 
//		s1 += "d"; 
//		System.out.println(s1 + " " + s2 + " " + (s1 == s2)); 
//	}
public static void main(String[] args) throws InterruptedException 
    { 
        String str = new String("Morgan Stanley");         
        str = null;  
        System.gc(); 
        Thread.sleep(1000); 
        System.out.println("end of main"); 
    } 
    @Override
    protected void finalize()  
    { 
        System.out.println("finalize method called"); 
    } 
	private static final int SIZE=1000;
	private LinkedList<Pair> pairs[];
	public CustomHashMap(){
		pairs = new LinkedList[SIZE];
	}
	public void put(int key, int value ){
		Pair pair = new Pair();
		pair.key = key;
		pair.value = value;
		int hashCode = hashCode(key) % SIZE;
		LinkedList<Pair> existingPairs = pairs[hashCode];
		if(existingPairs == null){
			existingPairs = new LinkedList<>();
		}
		Iterator<Pair> it = existingPairs.iterator();
		while(it.hasNext()){
			Pair existingPair = it.next();
			if(existingPair.key == key){
				it.remove();
			}
		}
		existingPairs.add(pair);
		pairs[hashCode] = existingPairs;
	}
	
	public Integer get(int key ){
		int hashCode = hashCode(key) % SIZE;
		
		LinkedList<Pair> existingPairs =  pairs[hashCode];
		if(existingPairs == null){
			return -1; 
		}
		Iterator<Pair> it = existingPairs.iterator();
		while(it.hasNext()){
			Pair pair = it.next();
			if(pair.key == key){
				return pair.value;
			}
		}
		return -1;
	}
	
	public void remove(int key ){
		int hashCode = hashCode(key) % SIZE;
		LinkedList<Pair> existingPairs =  pairs[hashCode];
		if(existingPairs == null){
			//
		}
		Iterator<Pair> it = existingPairs.iterator();
		while(it.hasNext()){
			Pair pair = it.next();
			if(pair.key == key){
				it.remove();
			}
		}
	}
	
	int hashCode(int key){
		return key;
	}
}
