package String;
/**
 * Given an input string, reverse the string word by word.

Example:  

Input: "the sky is blue",
Output: "blue is sky the".
Note:

A word is defined as a sequence of non-space characters.
Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
You need to reduce multiple spaces between two words to a single space in the reversed string.
 * @author kokonatsudream
 *
 */
public class ReverseWord {
	public String reverseWords(String s) {
        if(s == null) return null;
        
        String[] words = s.trim().split("\\s+");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = words.length -1; i >=0; i--) {
        	sb.append(words[i]);
        	sb.append(" ");
        }
        
        return sb.toString().trim();
    }
}
