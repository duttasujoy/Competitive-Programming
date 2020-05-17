package com.practice.sujoy.recursion;

import java.util.HashMap;
import java.util.Map;

class StairCaseHelper {
	public static void main(String[] args) {
		StairCaseHelper obj = new StairCaseHelper();
		System.out.println(obj.climbStairs(10));
	}
    public Map<Integer,Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            arr[i]=0;
        }
        return helper(n,arr);
    }
    public int helper(int n,int arr[]){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(arr[n]!= 0){
            return arr[n];
        }
        int result = helper(n-1,arr)+helper(n-2,arr);
        arr[n]=result;
        return result;
    }
}