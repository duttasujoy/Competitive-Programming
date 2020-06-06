package com.practice.leetcode.challenge.june;

import java.util.Random;

class RandomPickwithWeight {

	private int weight[];
	private int range[][];
	int cumulativeSum =0;
	private Random rand;
	public static void main(String[] args) {
		int[] w = {3, 14, 1, 7};
		RandomPickwithWeight obj = new RandomPickwithWeight(w );
		obj.pickIndex();
	}
    public RandomPickwithWeight(int[] w) {
    	rand = new Random(); 
    	weight = w;
         range = new int[w.length][2];
         for(int i=0;i<w.length;i++){
        	 range[i][0]=cumulativeSum;
        	 cumulativeSum+=w[i];
        	 range[i][1]=cumulativeSum;
         }
    }
    
    public int pickIndex() {
    	int random = rand.nextInt(cumulativeSum)+1 ;
    	for(int i=0;i<weight.length;i++){
    		if(random>range[i][0] && random<=range[i][1]){
    			return i;
    		}
    	}
    	return 0;
    }
}