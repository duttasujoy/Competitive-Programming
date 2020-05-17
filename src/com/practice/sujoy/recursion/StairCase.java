package com.practice.sujoy.recursion;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(stepPerms(n));
	}
	static int stepPerms(int n) {
		if(n==1){
			return 1;
		}
		if(n==2){
			return 2;
		}
		if(n==3){
			return 4;
		}
		return stepPerms(n-1)+stepPerms(n-2)+stepPerms(n-3);
    }
}
