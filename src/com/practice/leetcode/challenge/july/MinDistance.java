package com.practice.leetcode.challenge.july;

import java.util.PriorityQueue;
import java.util.Stack;

public class MinDistance {

	public static void main(String[] args) {

		int v[] = {2,-3,1,2};
		int pos[] = {1,2,3,4};
		
		int s = findDis(v,pos);
		System.out.println(s);
	}

	private static int findDis(int[] v, int[] pos) {
		
		int distance = 0;
		int i=0;
		int resource =0;
		int prevPos =0;
		PriorityQueue<Pair> pairs = new PriorityQueue<>((a,b) -> a.value-b.value);
		while(i<v.length){
			if(resource + v[i]>0){
				resource +=v[i];
				distance += Math.abs(pos[i]-prevPos);
				prevPos = pos[i];
				i++;
				while(!pairs.isEmpty() && pairs.peek().value + resource >=0){
					Pair pair =pairs.poll();
					resource +=pair.value;
					distance += Math.abs(pos[pair.pos]-prevPos);
					prevPos = pos[pair.pos];
				}
			}
			else{
				Pair pair = new Pair(v[i],i); 
				pairs.add(pair);
				distance += Math.abs(pos[i]-prevPos);
				prevPos = pos[i];
				i++;
			}
				
		}
		return distance;
	}
	
	private static class Pair{
		int value;
		int pos;
		Pair(int value,int pos){
			this.value = value;
			this.pos = pos;
		}
	}

}
