package Medium;

/**
 * LeetCode 647
 * @author kokonatsudream
 *
 */
public class PalindromicSubstrings {
	public int countSubstrings(String s) {
        int count = s.length();
        
        for(int i = 0; i < s.length(); i++){
        	count += countPalindromes(s, i, i + 1);
        	count += countPalindromes(s, i - 1, i + 1);
        }
        
        return count;
    }
	
	public int countPalindromes(String s, int start, int end){
		if(start < 0 || end >= s.length()){
			return 0;
		}
		int count = 0;
		while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
			count++;
			start--;
			end++;
		}
		
		return count;
		
	}
}
