package com.practice.leetcode.challenge.june;
public class CoinChange2 {
	public static void main(String[] args) {
		CoinChange2 obj = new CoinChange2();
		int[] coins = {1, 2, 5};
		int amount = 5;
		System.out.println(obj.change(amount , coins ));
	} 
    public int change(int amount, int[] coins) {
        int dp[][] = new int[coins.length+1][amount+1];
        for(int i=0;i<=coins.length;i++){
        	for(int j=0;j<=amount;j++){
        		if(i==0){
        			if(j==0){
        				dp[i][j]=1;
        				continue;
        			}
        			dp[i][j]=0;
        			continue;
        		}
        		if(j==0){
        			dp[i][j]=1;
        			continue;
        		}
        		if(coins[i-1]<=j)
        		dp[i][j]=dp[i][j-coins[i-1]]+dp[i-1][j];
        		else
        		dp[i][j]=dp[i-1][j];
        	}
        }
        return dp[coins.length][amount];
    }
}