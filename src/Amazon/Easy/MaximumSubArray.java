package Amazon.Easy;
/**
 * LeetCode 53
 * @author kokonatsudream
 *
 */
public class MaximumSubArray {
	public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for(int i = 0; i < nums.length; i++){
        	if(currentSum < 0)currentSum = nums[i];
        	else currentSum += nums[i];
        	
        	if(currentSum > maxSum){
        		maxSum = currentSum;
        	}
        }
        return maxSum;
    }
}
