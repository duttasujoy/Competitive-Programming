package com.practice.sujoy.dp;

import java.util.ArrayList;
import java.util.List;

public class BuySellStock {

	public static void main(String[] args) {
		int a[] = {100,180,260,310,40,535,695};
		findDayForBuySellStock(a);

	}

	private static void findDayForBuySellStock(int[] a) {

		boolean buyFlag = true;
		List<Integer> buy = new ArrayList<>();
		List<Integer> sell = new ArrayList<>();
		int i=0,j=i+1;
		while(i<=j){
			if(buyFlag){
				if(j<a.length && a[i]<a[j]){
					buy.add(i);
					buyFlag=false;
				}
				
					
			}
			else{
				if(a[j]<a[i]){
					sell.add(j-1);
					buyFlag=true;
				}
				if(j==a.length-1){
				sell.add(j);
				break;
				}
			}
			
			i++;
			j++;
		}
		for(int k=0;k<buy.size();k++){
		    System.out.println("("+buy.get(k)+" "+sell.get(k)+")");
		}
	}

}
