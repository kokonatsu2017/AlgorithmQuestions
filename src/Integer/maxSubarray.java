package Integer;

public class maxSubarray {
	/**
	 * Find the contiguous subarray within an array 
	 * (containing at least one number) which has the largest sum.
	 * @param nums
	 * @return
	 */
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
