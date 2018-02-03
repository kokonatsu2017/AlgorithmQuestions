package String;


/**
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. 
 * You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
 * 
 *
 */
public class RepeatedSubstring {
	public boolean repeatedSubstringPattern(String s) {
		String ss = s + s;
        
        return ss.substring(1, ss.length() -1).contains(s);
    }
}	
