package com.practice.leetcode.challenge.july;
public class HammingDistance {
	public static void main(String[] args) {
		HammingDistance obj = new HammingDistance();
		int n1 =4;
		int n2 =1;
		System.out.println(obj.hammingDistance(n1 , n2 ));
	}
    public int hammingDistance(int n1, int n2) {
        int x = n1 ^ n2; 
        int setBits = 0; 

        while (x > 0)  
        { 
            setBits += x & 1; 
            x >>= 1; 
        }  

        return setBits; 
    }
}