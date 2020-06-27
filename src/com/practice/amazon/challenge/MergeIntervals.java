package com.practice.amazon.challenge;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {

	public static void main(String[] args) {
		MergeIntervals obj = new MergeIntervals();
		int[][] intervals = {{1,4},{0,0}};
		obj.merge(intervals);
	}
	
	public int[][] merge(int[][] intervals) {
        if(intervals == null||intervals.length ==0){
            return intervals;
        }
        Arrays.sort(intervals,(a,b) -> {
        	return a[0] < b[0] ? -1 : a[0] == b[0] ? 0 : 1;
            });
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
          if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
            merged.add(interval);
          }
          else {
            merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
          }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
