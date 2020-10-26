package com.practice.sujoy.string;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class RetrieveMostFrequentlyUsedWords
{       
	
	public static void main(String[] args) {
		String s = "Sujoy's";
		System.out.println(s.replace("'s", ""));
		
		
		String helpText ="Jack and Jill went to the market to buy bread and cheese. Ch";
	}
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<String> retrieveMostFrequentlyUsedWords(String helpText, 
                                                 List<String> wordsToExclude)
    {

        wordsToExclude.add("an");
        wordsToExclude.add("the");
        List<String> excludedWord = wordsToExclude.stream()
                                                .map(item ->item.toLowerCase())
                                                .collect(Collectors.toList());
        List<String> words = Arrays.stream(helpText.split(" "))
                                    .map(item -> item.toLowerCase())
                                    .flatMap(item -> Arrays.stream(item.split("'")))
                                    .collect(Collectors.toList());
        List<String> actualWordsToAnalyze = words.stream()
                                            .filter(item -> !excludedWord.contains(item))
                                            .collect(Collectors.toList());
        Map<String, Integer> wordMap = new HashMap<>();
        
        int maxValue = 0;
        for(String item:actualWordsToAnalyze){
            int count = wordMap.getOrDefault(item,0)+1;
            if(maxValue<count){
                maxValue = count;
            }
            wordMap.put(item, count);
        }
        
        Map<String,Integer>sortedMap = wordMap.entrySet().stream()
                                                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                                                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (e1,e2) -> e2,
                                                    LinkedHashMap::new));
        List<String> result = new ArrayList<>();
        for(Entry<String,Integer> entry: sortedMap.entrySet()){
            if(entry.getValue() ==maxValue){
                result.add(entry.getKey());
            }
        }
        return result;
    }
    // METHOD SIGNATURE ENDS
}