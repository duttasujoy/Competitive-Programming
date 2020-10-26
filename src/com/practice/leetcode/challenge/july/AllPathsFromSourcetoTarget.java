package com.practice.leetcode.challenge.july;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourcetoTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    	List<List<Integer>> result = new ArrayList<>();
    	List<Integer> path = new ArrayList<>();
    	dfs(graph,result,path,0);
		return result;
    }

	private void dfs(int[][] graph, List<List<Integer>> result, List<Integer> path, int n) {
		path.add(n);
		if(n==graph.length-1) result.add(new ArrayList<>(path));
		for(int i=0;i<graph[n].length;i++){
			dfs(graph, result, path, graph[n][i]);
		}
		path.remove(path.size()-1);
	}
}