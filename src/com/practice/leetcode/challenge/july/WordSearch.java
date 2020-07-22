package com.practice.leetcode.challenge.july;
public class WordSearch {
	public static void main(String[] args) {
		WordSearch obj = new WordSearch();
		char[][] board = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
		String word = "AAB";
		System.out.println(obj.exist(board, word));
	}
    public boolean exist(char[][] board, String word) {
        boolean visited[][] = new boolean[board.length][board[0].length];
        int i=0;
        boolean result = false;
        for(int j=0;j<board.length;j++){
        	for(int k=0;k<board[0].length;k++){
        		if(dfs(board,visited,i,word,j,k)){
        			result =true;
        		}
        	}
        }
        
        return result;
    }

	private boolean dfs(char[][] board, boolean[][] visited, int i, String word, int row, int col) {

		
		
		if(visited[row][col] == true  || board[row][col]!=word.charAt(i))
		{
			return false;
		}
		visited[row][col] = true;
		i++;
		if(i>word.length()-1){
			return true;
		}
		boolean right = row<board.length -1?dfs(board, visited, i, word, row+1, col):false;
		if(right) return right;
		boolean left = row>0?dfs(board, visited, i, word, row-1, col):false;
		if(left) return left;
		boolean top = col>0?dfs(board, visited, i, word, row, col-1):false;
		if(top) return top;
		boolean bottom = col<board[0].length-1?dfs(board, visited, i, word, row, col+1):false;
		if(bottom) return bottom;
		visited[row][col] = false;
		return false;
	}
}