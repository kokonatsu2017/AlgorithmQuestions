package Amazon.Medium;
/**
 * LeetCode 5
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

	Example 1:
	
	Input: "babad"
	Output: "bab"
	Note: "aba" is also a valid answer.
	Example 2:
	
	Input: "cbbd"
	Output: "bb"
 * @author kokonatsudream
 *
 */
public class LongestPalindromicSubstring {
	
	int max = 1;
    int begin = 0;
    
    public String longestPalindrome(String s) {
		
        if(s.isEmpty()) return "";
        
        for(int i = 0; i < s.length(); i++){
        	maxPalindrome(s, i - 1, i + 1, 1);
        	maxPalindrome(s, i, i + 1, 0);
        }
        return s.substring(begin, begin + max);
    }

	public void maxPalindrome(String s,int right, int left, int curr){
		while(right >= 0 && left <= s.length() - 1){
    		
    		if(s.charAt(right) == s.charAt(left)){
    			curr += 2;
    			if(curr > max){
            		max = curr;
            		begin = right;
            	}
        		right--;
        		left++;
    		} else {
    			break;
    		}
    	}
	}
}
