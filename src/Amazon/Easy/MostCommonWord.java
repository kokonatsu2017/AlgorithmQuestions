package Amazon.Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 819
 * @author kokonatsudream
 *
 */
public class MostCommonWord {
	public String mostCommonWord(String paragraph, String[] banned) {
		String[] words = paragraph.toLowerCase().split("[ !?',;.]+");
        Map<String, Integer> freq = new HashMap<>();
        
        for(String word: words){
        	
        	freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        
        String maxWord = "";
        int max = 0;
        for(Map.Entry<String, Integer> entry : freq.entrySet()){
        	if(entry.getValue() > max){
        		boolean flag = true;
        		
        		for(int i = 0; i < banned.length; i++){
        			if(banned[i].equals(entry.getKey())){
        				flag = false;
        				break;
        			}
        		}
        		if(flag){
	        		max = entry.getValue();
	        		maxWord = entry.getKey();
        		}
        	}
        }
        
        return maxWord;
    }
}
