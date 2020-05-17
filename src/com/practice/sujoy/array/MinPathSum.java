package com.practice.sujoy.array;
public class MinPathSum {
	public static void main(String[] args) {
		int arr[][]={{-2,-3,3},
				 {-5,-10,1},
				 {10,30,-5}};
		MinPathSum obj  = new MinPathSum();
		System.out.println(obj.minPathSum(arr));
	}
    public int minPathSum(int[][] dungeon) {
    	int dp[][] = new int[dungeon.length][dungeon[0].length];
        for(int i=0;i<dungeon.length;i++){
            for(int j=0;j<dungeon[0].length;j++){
            	dp[i][j]=dungeon[i][j];
                if(i==0&&j==0){
                	continue;
                }
                if(j==0){
                	dp[i][j]+= dp[i-1][j];
                	continue;
                }
                if(i==0){
                	dp[i][j] += dp[i][j-1];
                	continue;
                }
                dp [i][j] += Math.abs(dp[i][j-1])<Math.abs(dp[i-1][j])?dp[i][j-1]:dp[i-1][j];
            }
        }
        return dp[dungeon.length-1][dp[0].length-1]>0?dp[dungeon.length-1][dp[0].length-1]:Math.abs(dp[dungeon.length-1][dp[0].length-1])+1;
    }
}