package com.practice.leetcode.challenge;
public class PerfectSqareCheck {
	
	public static void main(String[] args) {
		PerfectSqareCheck obj = new PerfectSqareCheck();
		System.out.println(obj.isPerfectSquare(808201));
		
	}
    public boolean isPerfectSquare(int num) {
        if(num <2){
            return true;
        }
        
        if(num==4){
        	return true;
        }
        
        long start = 2;
        Long end = (long) (num/2);
        while(start <end){
            Long mid=((start+end)/2);
            if(mid*mid==num){
                return true;
            }
            if(mid*mid>num){
                end=mid;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}