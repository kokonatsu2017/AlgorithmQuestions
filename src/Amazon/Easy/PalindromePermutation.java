package Amazon.Easy;

/**
 * LeetCode 266
 * 
 * 
 * Given a string, determine if a permutation of the string could form a palindrome.

Example 1:

Input: "code"
Output: false
Example 2:

Input: "aab"
Output: true
Example 3:

Input: "carerac"
Output: true

 * @author kokonatsudream
 *
 */
public class PalindromePermutation {
	public boolean canPermutePalindrome(String s) {
        int[] chars = new int[256];
        
        for(int i = 0; i < s.length(); i++){
        	chars[s.charAt(i)]++;
        };
        int odd = 0;
        for(int i = 0; i < 26; i++){
        	if(chars[i] % 2 == 1){
        		odd++;
        	}
        	if(odd > 1){
        		return false;
        	}
        }
        return true;
        
    }
}
