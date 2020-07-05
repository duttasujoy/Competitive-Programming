package com.practice.leetcode.challenge.july;

import java.util.ArrayList;
import java.util.List;

public class UglyNumberII {
    public int nthUglyNumber(int n) {
        
        List<Integer> numbers = new ArrayList<>();
        int i=0,j=0,k=0;
        numbers.add(1);
        while(numbers.size()<n){
            int temp1 = numbers.get(i)*2;
            int temp2 = numbers.get(j)*3;
            int temp3 = numbers.get(k)*5;
            
            int minNum = Math.min(temp1,Math.min(temp2,temp3));
            if(minNum == temp1){
                i++;
            }
            if(minNum == temp2){
                j++;
            }
            if(minNum == temp3){
                k++;
            }
            numbers.add(minNum);
        }
        return numbers.get(n-1);
    }
}