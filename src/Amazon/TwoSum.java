package Amazon;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * Lettcode 1 
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 * @author kokonatsudream
 *
 */
public class TwoSum {
	 public int[] twoSum(int[] nums, int target) {
	       Map<Integer, Integer> sums = new HashMap<Integer, Integer>();
	        int[] res = new int[2];
	        for(int i = 0; i < nums.length; i++){
	        	int other = target - nums[i];
	        	
	        	if(sums.containsKey(other)){
	        		res[0] = sums.get(other);
	        		res[1] = i;
	        	} else {
	        		sums.put(nums[i], i);
	        	}
	        }
	        
	        return res;
	    }
}
