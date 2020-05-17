package com.practice.sujoy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestFibonacciSubSequence {

	public static void main(String[] args) {
		Integer arr[] = {5,4,3,6,1};
		List<Integer> list = findFibSubSequence(arr);
		System.out.println(list);
	}

	private static List<Integer> findFibSubSequence(Integer[] arr) {
		int max = Collections.max(Arrays.asList(arr));
		List<Integer> fib = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		int a=0;
		int b=1;
		while(b<max){
			int c = a+b;
			a =b;
			b =c;
			fib.add(c);
		}
		for(int value :arr){
			if(fib.contains(value)){
				result.add(value);
			}
		}
		return result;
	}

}
