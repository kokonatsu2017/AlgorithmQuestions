package Amazon.Easy;
/**
 * LeetCode 461
 * @author kokonatsudream
 *
 */
public class HammingDistance {
	public int hammingDistance(int x, int y) {
        int c = x ^ y;
        int count = 0;
        
        while(c != 0){
        	count += c & 1;
        	c = c >> 1;
        }
        
        return count;
    }
}
