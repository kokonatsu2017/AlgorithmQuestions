package String;
import java.util.HashSet;

public class longestSubstringWithoutRepeat {
	/**
	 * Given a string, find the length of the longest substring without repeating characters.
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        HashSet<Character> set = new HashSet<Character>();
        while(j < s.length()) {
        	if(!set.contains(s.charAt(j))) {
        		set.add(s.charAt(j));
        		j++;
        		max = Math.max(set.size(), max);
        	} else {
        		set.remove(s.charAt(i));
        		i++;
        	}
        }
        return max;
    }
}
