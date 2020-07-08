package com.practice.leetcode.challenge.july;

import java.util.concurrent.atomic.AtomicInteger;

public class IslandPerimeter {
	public int islandPerimeter(int[][] grid) {
        AtomicInteger peri = new AtomicInteger(0);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j,peri);
                    break;
                } 
            }
        }
        return peri.get();
    }

	private void dfs(int[][] grid, int i, int j, AtomicInteger peri) {

        if(grid[i][j]!=1) return;
		grid[i][j]=2;
		if(i==0||grid[i-1][j]==0) peri.incrementAndGet();
		if(i==grid.length-1||grid[i+1][j]==0) peri.incrementAndGet();
		if(j==0||grid[i][j-1]==0) peri.incrementAndGet();
		if(j==grid[0].length-1||grid[i][j+1]==0) peri.incrementAndGet();
		
		if(i>0) dfs(grid, i-1, j, peri);
		if(i<grid.length-1) dfs(grid, i+1, j, peri);
		if(j>0) dfs(grid, i, j-1, peri);
		if(j<grid[0].length-1) dfs(grid, i, j+1, peri);
	}
}