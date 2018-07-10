package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. 
 * In other words, one of the first string's permutations is the substring of the second string.
 * @author kokonatsudream
 *
 */
public class PermutationInString {
	 public boolean checkInclusion(String s1, String s2) {
		 if(s1.isEmpty()|| s2.isEmpty() || s2.length() < s1.length()) return false;
		 
		 int[] s1counts = new int[26];
		 int[] s2counts = new int[26];
		 
		 for(int i = 0; i < s1.length(); i++) {
			 s1counts[s1.charAt(i) - 'a']++;
			 i++;
		 }
		 
		 int i = 0;
		 while(i < s1.length()) {
			 s2counts[s2.charAt(i) - 'a']++;
		 }
		 
		 if(Arrays.equals(s1counts, s2counts)) return true;
		 
		 while(i < s2.length()) {
			 s2counts[s2.charAt(i - s1.length()) - 'a']--;
			 s2counts[s2.charAt(i) - 'a']++;
			 
			 if(Arrays.equals(s1counts, s2counts)) return true;
			 i++;
		 }
		 
		 return false;
	 }
}
