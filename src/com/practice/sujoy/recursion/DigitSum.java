package com.practice.sujoy.recursion;

import java.util.Scanner;

public class DigitSum {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		String[] nk = scanner.nextLine().split(" ");

		String n = nk[0];

		int k = Integer.parseInt(nk[1]);
		Long sum =0L;
		while(n.matches("^[0-9]+$")){
			String p = n.charAt(0)+"";
			sum+=Long.parseLong(p);
			n=n.replaceFirst(p,"");
		}
		//        String number = "";
		//        while(k-->0){
		//        	number +=n;
		//        }
		//        Long numberInInt = Long.parseLong(number);
		Long result = superDigit(sum*k);
		System.out.println(result);
	}
	private static Long superDigit(Long number) {
		Long sum =0L;
		while(number >0){
			sum+=number%10;
			number=number/10;
		}
		if(sum>9){
			return superDigit(sum);
		}
		return sum;
	}

}
