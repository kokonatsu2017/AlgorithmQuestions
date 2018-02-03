package Integer;


/**
 * Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. 
 * And you need to output the maximum average value.
 * 
 *
 */
public class MaxAverageSubArray {
	public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i = 0; i < k; i++) sum+= nums[i];
        
        double max = sum;
        
        for(int i = k; i < nums.length; i++){
        	sum += nums[i] - nums[i - k];
        	max = Math.max(max,  sum);
        }
        
        return max / k;
    }
}
