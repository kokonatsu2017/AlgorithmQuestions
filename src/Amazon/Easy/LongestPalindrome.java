package Easy;
/**
 * LeetCode 409
 * @author kokonatsudream
 *
 */
public class LongestPalindrome {
	public int longestPalindrome(String s) {
        int[] small = new int[256];
        
        for(int i = 0; i < s.length(); i++){
        	small[s.charAt(i)]++;
        }
        boolean odd = false;
        int num = 0;
        for(int i = 0; i < 256; i++){
        	if(small[i] % 2 == 0){
        		num += small[i];
        	} else {
        		odd = true;
        		num += small[i] - 1;
        	}
        }
        
        if(odd){
        	return num +1;
        } else {
        	return num;
        }
    }
}
