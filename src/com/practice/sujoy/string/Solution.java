package com.practice.sujoy.string;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{ 
	public static void main(String[] args) {
		Solution obj = new Solution();
		int logFileSize = 6;
		List<String> logLines = Arrays.asList("t2 13 121 198", 
									"f3 52 54 31");
		System.out.println(obj.reorderLines(logFileSize, logLines));
	}
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public List<String> reorderLines(int logFileSize, List<String> logLines) 
	{
		Collections.sort(logLines, new Comparator<String>(){

			public int compare(String o1,String o2){
				String o1Arr[] = o1.split(" ");
				String o2Arr[] = o2.split(" ");
				String key1 =o1Arr[0];
				String key2 = o2Arr[0];
				if(o1Arr[1].charAt(0)<'A' && o2Arr[1].charAt(0)>='A'){
					return 1;
				}
				if(o2Arr[1].charAt(0)<'A'&& o1Arr[1].charAt(0)>='A'){
					return -1;
				}
				for(int i=1;i<o1Arr.length && i<o2Arr.length;i++){
					int comp = o1Arr[i].compareTo(o2Arr[i]);
					if( comp!= 0){
						return comp;
					}
				}

				return key1.compareTo(key2);
			}
		});
		return logLines;
	}
	// METHOD SIGNATURE ENDS
}