package com.practice.leetcode.challenge.july;

import java.util.Arrays;

public class PrisonCellsAfterNDays {
	public static void main(String[] args) {
		PrisonCellsAfterNDays obj = new PrisonCellsAfterNDays();
		int[] cells = {0,1,0,1,1,0,0,1};
		int N = 7;
		System.out.println(Arrays.toString(obj.prisonAfterNDays(cells, N )));
				
	}
	public int[] prisonAfterNDays(int[] cells, int N) {
	        int cycle =1;
	        int first[] = new int[cells.length];
	        for(int i=1; i<7; i++)
	        {
	            first[i] = (cells[i-1] == cells[i+1] ? 1 :0);
	        }
	        for(int i=0; i<8; i++)
	            cells[i] = first[i];
	        N--;
	        while(N-->0){
	            int temp[] = new int[cells.length];
	            for(int i=1; i<7; i++)
	            {
	                temp[i] = (cells[i-1] == cells[i+1] ? 1 :0);
	            }
	            if(Arrays.equals(temp,first)){
	                N= N%cycle;
	            }
	            for(int i=1; i<7; i++)
	            {
	                cells[i] = temp[i];
	            }
	            cycle++;
	        }
	        return cells;
	    }
}

