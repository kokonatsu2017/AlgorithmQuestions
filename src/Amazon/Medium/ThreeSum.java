package Amazon.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 15
 * 
 * Given an array nums of n integers, 
 * are there elements a, b, c in nums such that a + b + c = 0? 
 * Find all unique triplets in the array which gives the sum of zero.
 * @author kokonatsudream
 *
 */
public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		
		List<List<Integer>> res = new ArrayList<>();
		
		if(nums == null || nums.length < 3)
			return res;
		
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length - 2; i++){
			if(i == 0 || nums[i] > nums[i-1]){
				int j = i + 1;
				int z = nums.length - 1;
				
				while(j < z){
					if(nums[i] + nums[j] + nums[z] == 0){
						List<Integer> set = new ArrayList<>();
						set.add(nums[i]);
						set.add(nums[j]);
						set.add(nums[z]);
						res.add(set);
						
						j++;
						z--;
						
						while(j < z && nums[j] == nums[j-1])
							j++;
						while(j < z && nums[z] == nums[z+1])
							z--;
					} else if(nums[i] + nums[j] + nums[z] < 0){
						j++;
					} else {
						z--;
					}
				}
			}
		}
		
		return res;
        
    }
}
