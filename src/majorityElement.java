package lettcodePractice;

import java.util.HashMap;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
 * 
 */
public class majorityElement {
	public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numnum = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
        	if(!numnum.containsKey(nums[i])){
        		numnum.put(nums[i], 1);
        	} else {
        		numnum.put(nums[i], numnum.get(nums[i])+ 1);
        		if(numnum.get(nums[i]) > nums.length / 2) return nums[i];
        	}
        }
        return -1;
    }
}
