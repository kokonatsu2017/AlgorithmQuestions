package String;


import java.util.HashMap;
import java.util.Map;
/**
 * Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and 
then add one more letter at a random position.

Find the letter that was added in t.
 * 
 *
 */
public class FindDifference {
	public char findTheDifference(String s, String t) {
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(map.containsKey(c)){
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		for(int i = 0; i < t.length(); i++){
			char c = t.charAt(i);
			
			if(map.containsKey(c)){
				if(map.get(c) == 0)
					return c;
				else
					map.put(c, map.get(c) - 1);
			}else {
				return c;
			}
		}
		return ' ';
    }
}