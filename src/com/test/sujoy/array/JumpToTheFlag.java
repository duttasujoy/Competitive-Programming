package com.test.sujoy.array;

public class JumpToTheFlag {

	public static void main(String[] args) {
		System.out.println(jumps(3,3));

	}

	public static int jumps(int k, int j) {
        int count =0;
        int big =1,small =1;
        if(j>1){
            big =j;
        }
        else{
            small = j;
        }
        while(k>=big){
            k = k-big;
            count ++;
        }
        return count+k;
    }
}
