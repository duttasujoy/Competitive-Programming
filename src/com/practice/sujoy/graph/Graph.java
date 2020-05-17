package com.practice.sujoy.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Graph { 
    
    public final int V; 
    public final List<List<Integer>> adj; 
  
    public Graph(int V)  
    { 
        this.V = V; 
        adj = new ArrayList<>(V); 
          
        for (int i = 0; i < V; i++) 
            adj.add(new LinkedList<>()); 
    }
    
    public void addEdge(int source, int dest) { 
        adj.get(source).add(dest); 
    } 
}
