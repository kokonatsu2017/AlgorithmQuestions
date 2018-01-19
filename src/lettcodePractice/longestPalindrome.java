package lettcodePractice;

public class longestPalindrome {
	/**
	 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

		This is case sensitive, for example "Aa" is not considered a palindrome here.
	 * @param s
	 * @return
	 */
	public int longestPalindrome(String s) {
        int[] lower = new int[26];
        int[] upper = new int[26];
        
        for(int i = 0; i < s.length(); i++){
        	char c = s.charAt(i);
        	
        	if(Character.isUpperCase(c)){
        		upper[c -'A']++;
        	} else {
        		lower[c - 'a']++;
        	}
        }
        
        int alphabets = 0;
        for(int i = 0; i < 26; i++){
            alphabets += (lower[i] /2 ) * 2;
            alphabets += (upper[i] /2 ) * 2;
        }
        
        return alphabets == s.length() ? alphabets : alphabets + 1;

    }
}
