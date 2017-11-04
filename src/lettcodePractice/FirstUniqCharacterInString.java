package lettcodePractice;

import java.util.LinkedHashMap;

public class FirstUniqCharacterInString {
	/**
	 * Given a string, find the first non-repeating character in it and 
	 * return it's index. If it doesn't exist, return -1.
	 * 
	 */
	 public int firstUniqChar(String s) {
	        LinkedHashMap<Character, Boolean> ele = new LinkedHashMap<Character, Boolean>();
	        for(int i = 0; i < s.length(); i++){
	            char c = s.charAt(i);
	            if(ele.containsKey(s.charAt(i))){
	                ele.put(c, false);
	            } else{
	                ele.put(c, true);
	            }
	        }
	        for(int i = 0; i < s.length(); i++){
	            char c = s.charAt(i);
	            if(ele.get(c)){
	                return i;
	            }
	        }
	        return -1;
	    }
}
