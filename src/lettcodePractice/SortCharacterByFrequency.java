package lettcodePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortCharacterByFrequency {
	/**
	 * Given a string, sort it in decreasing order based on the frequency of characters.
	 * @param s
	 * @return
	 */
	public String frequencySort(String s) {
        HashMap<Character, Integer> tracker = new HashMap<Character, Integer>();
        
        for(int i = 0; i < s.length(); i++){
        	char c = s.charAt(i);
        	if(tracker.containsKey(c)){
        		tracker.put(c, tracker.get(c) + 1);
        	} else {
        		tracker.put(c, 1);
        	}
        }
        
        List<Character> [] bucket = new List[s.length() + 1];
        for(char c : tracker.keySet()){
        	int freq = tracker.get(c);
        	if(bucket[freq] == null){
        		bucket[freq] = new ArrayList<Character>();
        	}
        	bucket[freq].add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int index = bucket.length - 1; index >= 0; index--){
        	if(bucket[index] != null){
        		for(char c : bucket[index]){
        			for(int i = 0; i < tracker.get(c); i++){
        				sb.append(c);
        			}
        		}
        			
        	} 	
        }
        return sb.toString();
    }
}
