package com.practice.leetcode.challenge.july;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class ConvertDollerIntoWords {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      StringBuilder output = textDoller(line.toCharArray());
      output.append("Dollars");
      System.out.println(output.toString());
    }
  }
  private static StringBuilder textDoller(char[] num){
    int len = num.length;
    StringBuilder output = new StringBuilder();
    String[] single_digits = new String[]{ "Zero", "One",  
                                        "Two", "Three", "Four", 
                                        "Five", "Six", "Seven",  
                                            "Eight", "Nine"}; 
  
    String[] two_digits = new String[]{"", "Ten", "Eleven", "Twelve",  
                                        "Thirteen", "Fourteen", 
                                        "Fifteen", "Sixteen", "Seventeen", 
                                        "Eighteen", "Nineteen"}; 
  
    String[] tens_multiple = new String[]{"", "", "Twenty", "Thirty", "Forty",  
                                            "Fifty","Sixty", "Seventy",  
                                            "Eighty", "Ninety"}; 
  
    String[] tens_power = new String[] {"Hundred", "Thousand"};
    
    if(len<2){
      output.append(single_digits[num[0]-'0']);
      return output;
    }
    int x=0;
    while(x<num.length){
      if(len >=3){
        if(num[x]-'0'!=0){
           output.append(single_digits[num[x] - '0']); 
           output.append(tens_power[len - 3]);  
        }
        len--;
      }
      else{
        if (num[x] - '0' == 1)  
        { 
          int sum = num[x] - '0'; 
          output.append(two_digits[sum]); 
          return output; 
        }
        else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0) 
        { 
          output.append(tens_multiple[2]);
          return output; 
        } 
        else
        { 
          int i = (num[x] - '0'); 
          if(i > 0) 
            output.append(tens_multiple[i]); 
          else
            System.out.print(""); 
          ++x; 
          if (num[x] - '0' != 0) 
            output.append(single_digits[num[x] - '0']); 
        } 
      }
      
      ++x; 
    }
    return output;
  }
}