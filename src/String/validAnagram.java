package String;


public class validAnagram {
	/**
	 * Given two strings s and t, 
	 * write a function to determine if t is an anagram of s.
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] alp = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            alp[c-'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(alp[c-'a'] ==0) return false;
            else alp[c-'a']--;
        }
        
        return true;
    }
}
