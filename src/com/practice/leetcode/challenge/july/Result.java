package com.practice.leetcode.challenge.july;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'encryptionValidity' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER instructionCount
     *  2. INTEGER validityPeriod
     *  3. INTEGER_ARRAY keys
     */

	public static void main(String[] args) {
		Result obj = new Result();
		int instructionCount =100;
		int validityPeriod =1000;
		List<Integer> keys = Arrays.asList(2,2,4);
		System.out.println(obj.encryptionValidity(instructionCount, validityPeriod, keys ));
	}
    public static List<Integer> encryptionValidity(int instructionCount, int validityPeriod, List<Integer> keys) {
        List<Integer> result = new ArrayList<>();
        int max =0;
        for(int i=0;i<keys.size();i++){
            int item = keys.get(i);
            int count = 0;
            for(int j=0;j<keys.size();j++){
                if(item % keys.get(j)==0){
                    count ++;
                }
            }
            max = Math.max(max, count);   
        }
        int strenth = max * 100000;
        Long ways = (long)instructionCount * validityPeriod;
        int hackable =0;
        if(ways >=strenth){
            hackable =1;
        }
        result.add(hackable);
        result.add(strenth);
        return result;
    }

}