package com.practice.leetcode.challenge.june;
public class SurroundedRegions {
	public void solve(char[][] board) {
		if(board.length ==0){
			return;
		}
		int rowSize = board.length;
		int colSize=board[0].length;
		for(int i=0;i<board.length;i++){
			dfs(board,i,0);
			dfs(board,i,colSize-1);
		}
		for(int i=1;i<board[0].length-1;i++){
			dfs(board,0,i);
			dfs(board,rowSize-1,i);
		}
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length;j++){
				if(board[i][j]=='O')board[i][j]='X';
				else if(board[i][j]=='1')board[i][j]='O';
			}
		}
	}

	private void dfs(char[][] board, int row, int column) {

		if(board[row][column]=='O'){
			board[row][column]='1';
			if(row>0)dfs(board,row-1,column);
			if(row<board.length-1)dfs(board,row+1,column);
			if(column>0)dfs(board,row,column-1);
			if(column<board[0].length-1)dfs(board,row,column+1);
		}
	}
}