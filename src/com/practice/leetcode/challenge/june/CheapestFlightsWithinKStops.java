package com.practice.leetcode.challenge.june;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CheapestFlightsWithinKStops {

	public static void main(String[] args) {
		CheapestFlightsWithinKStops obj = new CheapestFlightsWithinKStops();
		int n =5;
		int[][] flights ={{4,1,1},{1,2,3},{0,3,2},{0,4,10},{3,1,1},{1,4,3}};
		int src =2;
		int dst =1;
		int K =1;
		System.out.println(obj.findCheapestPrice(n, flights, src, dst, K));
	}
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
    	List<Integer> adj[] = new List[n+1];
    	int costs[][] = new int[n+1][n+1];
    	for(int flight[]:flights){
    		List list = adj[flight[0]];
    		if(list == null){
    			list = new ArrayList<>();
    		}
    		list.add(flight[1]);
    		adj[flight[0]]=list;
    		costs[flight[0]][flight[1]] = flight[2];
    	}
    	AtomicInteger minFare = new AtomicInteger(Integer.MAX_VALUE);
    	boolean visited[] = new boolean[n+1];
    	solve(adj,costs,src,dst,K,visited,minFare,0);
    	if(minFare.get()== Integer.MAX_VALUE){
    		return -1;
    	}
    	return minFare.get();
    }

	private void solve(List<Integer>[] adj, int[][] costs, int src, int dst, int k, boolean[] visited,
			AtomicInteger minFare, int fare) {
		
		if(k<-1){
			return;
		}
		if(src == dst){
			minFare.set(Math.min(minFare.get(), fare));
			return;
		}
		if(adj[src] == null){
			return;
		}
		visited[src]= true;
		for(int i=0;i<adj[src].size();i++){
			List<Integer> list = adj[src];
			if(!visited[list.get(i)] && minFare.get()>fare+costs[src][list.get(i)]){
				solve(adj, costs, list.get(i), dst, k-1, visited, minFare, fare+costs[src][list.get(i)]);
			}
		}
		visited[src]=false;
	}
}