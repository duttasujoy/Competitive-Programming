package com.practice.leetcode.challenge.july;
class AddBinary {
    public String addBinary(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        int numA=0,numB=0,arrears =0;
        String result="";
        while(lengthA >0||lengthB>0){
            int sum =0;
            if(lengthA>0){numA = (a.charAt(lengthA-1)-'0'); sum +=numA;}
            if(lengthB>0){numB = (b.charAt(lengthB-1)-'0'); sum +=numB;}
            sum += arrears;
            arrears = (sum/2>0)?1:0;
            sum = sum %2;
            System.out.println(String.format("numA =%s numB =%s sum=%s arrears=%s",numA,numB,sum,arrears ));
            lengthA--;
            lengthB--;
            result = sum+result;
        }
        if (arrears ==1){
            result = arrears +result;
        }
        return result;
    }
}