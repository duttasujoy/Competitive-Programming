package com.practice.leetcode.challenge.july;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<List>newList = list.stream().map( item -> function(item) ).collect(Collectors.toList());


	}
	private static List function(Integer item){
		return new ArrayList<>();
	}

}
