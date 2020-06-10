package com.practice.leetcode.challenge.june;
public class PowerofTwo {
	public static void main(String[] args) {
		PowerofTwo obj = new PowerofTwo();
		int n=536870912;
		System.out.println(obj.isPowerOfTwo(n));
	}
    public boolean isPowerOfTwo(int n) {
      if(n==0){
    	  return false;
      }
      return Math.ceil(log2(n))==Math.floor(log2(n));
    }
    public double log2(int N) 
    { 
  
    	return (Math.log(N) / Math.log(2)); 
  
    } 
}