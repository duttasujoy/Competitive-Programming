package com.test.sujoy.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SpecialElementInMatrix {

	public static void main(String[] args) {
		List<Integer> list1= new ArrayList<>();
		list1.add(1);
		list1.add(3);
		list1.add(1);
		List<Integer> list2= new ArrayList<>();
		list2.add(5);
		list2.add(2);
		list2.add(9);
		List<Integer> list3= new ArrayList<>();
		list3.add(8);
		list3.add(7);
		list3.add(6);
		list3.add(10);
		List<List<Integer>> matrix= new ArrayList<>();	
		matrix.add(list1);
		matrix.add(list2);
		matrix.add(list3);
		int count = findPosElement(matrix);
		System.out.println(count);
	}

	private static int findPosElement(List<List<Integer>> matrix) {
		List<Integer> rowMin= new ArrayList<>();
		List<Integer> rowMax= new ArrayList<>();
		List<Integer> colMin= new ArrayList<>();
		List<Integer> colMax= new ArrayList<>();
		Iterator<List<Integer>> it = matrix.iterator();
		while(it.hasNext()){
			int rminn = Integer.MAX_VALUE; 
            int rmaxx = Integer.MIN_VALUE; 
            Iterator<Integer> rowIt = it.next().iterator();
            while(rowIt.hasNext()){
            	int value = rowIt.next();
            	if(value<0){
            		throw new RuntimeException("Invalid Input");
            	}
            	if(value == rmaxx||value ==rminn){
            		return -1;
            	}
            	if(value>rmaxx){
            		rmaxx=value;
            	}
            	if(value<rminn){
            		rminn=value;
            	}
            }
            rowMin.add(rminn);
            rowMax.add(rmaxx);
		}
		
		for(int i=0;i<matrix.get(0).size();i++){
			Iterator<List<Integer>> it2 = matrix.iterator();
			int cminn = Integer.MAX_VALUE; 
            int cmaxx = Integer.MIN_VALUE;
			while(it2.hasNext()){
				int value = it2.next().get(i);
				if(value<0){
            		throw new RuntimeException("Invalid Input");
            	}
				if(value == cmaxx||value ==cminn){
            		return -1;
            	}
            	if(value>cmaxx){
            		cmaxx=value;
            	}
            	if(value<cminn){
            		cminn=value;
            	}
			}
			colMax.add(cmaxx);
			colMin.add(cminn);
		}
		Set<Integer> set = new HashSet<>();
		set.addAll(colMax);
		set.addAll(colMin);
		set.addAll(rowMax);
		set.addAll(rowMin);
		return set.size();
	}

}
