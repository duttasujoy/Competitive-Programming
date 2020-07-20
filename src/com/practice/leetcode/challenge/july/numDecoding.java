package com.practice.leetcode.challenge.july;
class numDecoding {
	public static void main(String[] args) {
		numDecoding obj = new numDecoding();
		String s = "10";
		System.out.println(obj.numDecodings(s ));
	}
    public int numDecodings(String s) {
        char c[] = s.toCharArray();
        int result[] = new int[c.length];
        if(c[0]!='0')
        result[0]=1;
        for(int i=1;i<c.length;i++){
            int count =0;
            if((c[i] != '0'&& Integer.parseInt(c[i-1]+"")<2) ||(Integer.parseInt(c[i-1]+"")==2 && Integer.parseInt(c[i]+"")<7)){
                count++;
            }
            result[i] = result[i-1]+count;
        }
        return result[c.length-1];
    }
}
