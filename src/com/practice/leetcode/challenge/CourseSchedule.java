package com.practice.leetcode.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseSchedule {
    
	public static void main(String[] args) {
		CourseSchedule obj = new CourseSchedule();
		int numCourses = 2;
		int[][] prerequisites = {{1,0}};
		System.out.println(obj.canFinish(numCourses, prerequisites));
	}
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		List<Integer> adjList[] = new List[numCourses];
		for(int i=0;i<prerequisites.length;i++){
			List<Integer> list = adjList[prerequisites[i][0]];
			if(list == null){
				list = new ArrayList<>();
			}
			list.add(prerequisites[i][1]);
			adjList[prerequisites[i][0]] = list;
		}
		int visited[] = new int[numCourses+1];
		for(int i=0;i<numCourses;i++){
			if(isCyclic(i,adjList,visited)){
				return false;
			}
		}
		return true;
    }
	private boolean isCyclic(int i, List<Integer>[] adjList, int[] visited) {

		if(visited[i]==2){
			return true;
		}
		if(adjList[i]== null){
			return false;
		}
		visited[i] =2;
		for(int item:adjList[i]){
			if(visited[item]!=1){
				if(isCyclic(item, adjList, visited)){
					return true;
				}
			}
		}
		visited[i]=1;
		return false;
	}
}