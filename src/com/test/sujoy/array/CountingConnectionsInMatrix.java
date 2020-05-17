package com.test.sujoy.array;

import java.util.ArrayList;
import java.util.List;

public class CountingConnectionsInMatrix {

	public static void main(String[] args) {

		List<Integer> list1= new ArrayList<>();
		list1.add(1);
		list1.add(0);
		list1.add(0);
		list1.add(1);
		List<Integer> list2= new ArrayList<>();
		list2.add(0);
		list2.add(1);
		list2.add(1);
		list2.add(1);
		List<Integer> list3= new ArrayList<>();
		list3.add(1);
		list3.add(0);
		list3.add(0);
		list3.add(1);
		List<List<Integer>> matrix= new ArrayList<>();	
		matrix.add(list1);
		matrix.add(list2);
		matrix.add(list3);
		int count = findConnections(matrix);
		System.out.println(count);
	}

	private static int findConnections(List<List<Integer>> matrix) {
		int count =0;
		for (int i = 0;i<matrix.size();i++){
			List<Integer> curr = matrix.get(i);
			List<Integer> next = null;
			if(i+1<matrix.size()){
				next = matrix.get(i+1);
			}
			for(int j=0;j<curr.size();j++){
				Integer value = curr.get(j);
				if(value ==0){
					continue;
				}
				if(j+1<curr.size() && curr.get(j+1) == value){
					count ++;
				}
				if(next == null){
					continue;
				}
				if(j-1>=0 && value == next.get(j-1)){
					count ++;
				}
				if(value == next.get(j)){
					count ++;
				}
				if(j+1<next.size() && value == next.get(j+1)){
					count ++;
				}
				
			}
		}
		return count;
	}

}
