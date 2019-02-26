package Amazon.Easy;

import java.util.HashMap;
import java.util.Map;
/**
 * LeetCode 532
 * @author kokonatsudream
 *
 */
public class KdiffPairsInArray {
	public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        int count = 0;
        
         if ( k < 0) return 0; 
        
        for(int num : nums) {
        	if(!freq.containsKey(num)){
        		freq.put(num, 1);
        	} else {
        		freq.put(num, freq.get(num)+ 1);
        	}
        }
        
        for(int num : freq.keySet()) {
        	if( (k == 0 && freq.get(num) > 1) || (k != 0 && freq.containsKey(num + k)) ) {
        		count++;
        	}
        }
        
        return count;
    }
}
