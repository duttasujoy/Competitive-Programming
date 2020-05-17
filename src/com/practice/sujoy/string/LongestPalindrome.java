package com.practice.sujoy.string;
public class LongestPalindrome {
	public static void main(String[] args) {
		LongestPalindrome obj = new LongestPalindrome();
		System.out.println(obj.longestPalindrome("bb"));
	}
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        String output=s.substring(0,1);
        for(int x=0;x<s.length();x++){
            String even = findPalindrome(s,x-1,x+1);
            String odd = findPalindrome(s,x,x+1);
            String gen = even.length()>odd.length()?even:odd;
            output = output.length()>gen.length()?output:gen;
        }
     return output;   
    }
    private String findPalindrome(String s,int i,int j) 
    { 
        while(i>=0&&j<s.length()){
            if(s.charAt(i)!=s.charAt(j)){
                break;
            }
            i--;
            j++;
        }
        return s.substring(i+1,j);
    } 
}