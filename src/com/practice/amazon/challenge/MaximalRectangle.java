package com.practice.amazon.challenge;
class MaximalRectangle {
	public static void main(String[] args) {
		MaximalRectangle obj = new MaximalRectangle();
		char[][] matrix = {
				  {'1','0','1','0','0'},
				  {'1','0','1','1','1'},
				  {'1','1','1','1','1'},
				  {'1','0','0','1','0'}
				};
		System.out.println(obj.maximalRectangle(matrix ));
	}
    public int maximalRectangle(char[][] matrix) {
        int max =0;
        int dp[][] = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='0'){
                    dp[i][j]=0;
                    continue;
                }
                int left=0,top =0;
                if(i>0){
                    top = dp[i-1][j];
                }
                if(j>0){
                    left = dp[i][j-1];
                }
                dp[i][j]=1+Math.max(top,left);
                max = Math.max(dp[i][j],max);
            }
        }
        return max;
    }
}