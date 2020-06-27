package com.practice.amazon.challenge;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public static void main(String[] args) {
		HappyNumber obj = new HappyNumber();
		int n = 7;
		System.out.println(obj.isHappy(n ));
	}
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        return isTruelyHappy(n,set);
        
    }
    public boolean isTruelyHappy(int n, Set<Integer> set){
        if(n==1) return true;
        
        int sum=0;
        while(n/10 != 0){
            int x= n%10;
            sum += x*x;
            n=n/10;
        }
        sum+=n*n;
        
        if(sum == 1){
            return true;
        }
        else{
            
            if(set.contains(sum)){
                return false;
            }
            set.add(sum);
            return isTruelyHappy(sum,set);
        }
    }
}