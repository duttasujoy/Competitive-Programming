package com.practice.sujoy.dp;

import java.util.Scanner;

public class Abbreviation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		String count = findMinCharsRec(a,b);
		System.out.println(count);

	}

	private static String findMinChars(String a, String b) {
		int lengthA = a.length();
		int lengthB = b.length();
		int arr[][] = new int[lengthB][lengthA];
		int i=0,j=0;
		for(i=0;i<lengthB;i++){
			for(j=0;j<lengthA;j++){
				int c = 0;
				if(Character.toUpperCase(a.charAt(j))==b.charAt(i)){
					c = 1;
				}
				else if(Character.isUpperCase(a.charAt(j))){
					break;
				}
				int prevCol = 0;
				if(j!=0){
					prevCol = arr[i][j-1];
				}
				int prevRow = 0;
				if(i!=0){
					prevRow = arr[i-1][j];
				}
				arr[i][j] = Math.max(prevCol +c, prevRow);
			}
		}
		return i==lengthB && j==lengthA && arr[i-1][j-1]==lengthB?"YES":"NO";
	}
	
	private static String findMinCharsRec(String a, String b) {
		if(a.length()==0&&b.length()!=0){
			return "NO";
		}
		if(a.length()==0&&b.length()==0){
			return "YES";
		}
		if(b.length()==0){
			return a.equals(a.toLowerCase())?"YES":"NO";
		}
		if(Character.isUpperCase(a.charAt(0)) && a.charAt(0)!=b.charAt(0)){
			return "NO";
		}
		if(a.charAt(0)==b.charAt(0)||Character.toUpperCase(a.charAt(0))==b.charAt(0)){
			return findMinCharsRec(a.substring(1), b.substring(1));
		}
		
		return findMinCharsRec(a.substring(1), b);
		
	}

}
