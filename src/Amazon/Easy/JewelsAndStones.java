package Easy;
/**
 * LeetCode 771
 * @author kokonatsudream
 *
 */
public class JewelsAndStones {
	public int numJewelsInStones(String J, String S) {
        int[] jewels = new int[256];
        
        for(int i = 0; i < J.length(); i++){
        	jewels[J.charAt(i)]++;
        }
        int count = 0;
        for(int j = 0; j < S.length(); j++){
        	if(jewels[S.charAt(j)] != 0){
        		count++;
        	}
        }
        
        return count;
    }
}
