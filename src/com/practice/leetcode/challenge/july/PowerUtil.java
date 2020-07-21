package com.practice.leetcode.challenge.july;
public class PowerUtil {
	public static void main(String[] args) {
		PowerUtil sol = new PowerUtil();
		System.out.println(sol.myPow(1.00000,
				-2147483648));
	}
    public double pow_util(double x, long n) {
        System.out.println("x= "+x +" n= "+n);
        if(n==0)return 1.0;
        if(n==1) return x;
        if(n < 0) return pow_util(1/x, -n);
        double result = pow_util(x*x,n/2);
        if(n%2 ==1) result *= x;
        return result;
        
    }
     public double myPow(double x, int n) {
        return pow_util(x,n);
     }
  
}