package Medium;

import java.util.ArrayList;
import java.util.List;
/**
 * LeetCode 131
 * @author kokonatsudream
 *
 */
public class PalindromePartition {
	public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        
        backtrack(res, new ArrayList<>(), s, 0);
        
        return res;
        
    }
	
	public void backtrack( List<List<String>> res, List<String> tmp, String s, int start){
		if(start == s.length()){
			res.add(new ArrayList<>(tmp));
		} else {
			for(int i = start; i < s.length(); i++){
				if(isPalindrome(s, start, i)){
					tmp.add(s.substring(start, i + 1));
					backtrack(res, tmp, s, i + 1);
					tmp.remove(tmp.size() - 1);
				}
			}
		}
	}
	
	public boolean isPalindrome(String s, int low, int high){
		while(low < high){
			if(s.charAt(low) != s.charAt(high)){
				return false;
			}
			low++;
			high--;
		}
		return true;
	}
}
