package com.practice.leetcode.challenge.august;
public class ValidPalindrome {
	public static void main(String[] args) {
		ValidPalindrome obj = new ValidPalindrome();
		String s = "A man, a plan, a canal: Panama";
		System.out.println(obj.isPalindrome(s ));
	}
    public boolean isPalindrome(String s) {
    	for (int i = 0; i < s.length(); i++) 
        { 
            if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' && 
                    s.charAt(i) < 'a' || s.charAt(i) > 'z')  
            {  
                s = s.substring(0, i) + s.substring(i + 1); 
                i--; 
            } 
        } 
        return helper(s,0,s.length()-1);
    }
    
    public boolean helper(String s,int start,int end) {
        if(start ==end){
            return true;
        }
        if(Character.toLowerCase(s.charAt(start))!= Character.toLowerCase(s.charAt(end))){
            return false;
        }
        return helper(s,start+1,end-1);
    }
}