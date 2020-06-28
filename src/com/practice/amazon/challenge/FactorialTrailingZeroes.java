package com.practice.amazon.challenge;
public class FactorialTrailingZeroes {
	public static void main(String[] args) {
		FactorialTrailingZeroes obj = new FactorialTrailingZeroes();
		int n = 30;
		System.out.println(obj.trailingZeroes(n ));
	}
    public int trailingZeroes(int n) {
        int x=n/5;
        int count =x;
        while(x>=5){
            count+=x/5;
            x=x/5;
        }
            
        return count;
    }
}