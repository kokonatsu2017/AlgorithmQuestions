package Easy;
/**
 * LeetCode 387
 * @author kokonatsudream
 *
 */
public class FirstUniqueCharacterInAString {
	public int firstUniqChar(String s) {
		int[] tracker = new int[26];
        for(int i = 0; i < s.length(); i++){
        	
        	tracker[s.charAt(i) - 'a']++;
        	
        }
        
        for(int i = 0; i < s.length(); i++){
        	if(tracker[s.charAt(i) - 'a'] == 1){
        		return i;
        	}
        }
        
        return -1;
    }
}
