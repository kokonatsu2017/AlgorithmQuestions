package Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), 
 * where i and j are both numbers in the array and their absolute difference is k.
 * @author Kerry
 *
 */
public class KdiffPairs {
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
