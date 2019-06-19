package Medium;
/**
 * LeetCode 209
 * @author kokonatsudream
 *
 */
public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int s, int[] nums) {
        int[] preSum = new int[nums.length +1];
        for(int i = 1; i <= nums.length; i++){
        	preSum[i] = preSum[i - 1] + nums[i - 1];
        }
        
        int start = 0;
        int end = 1;
        int min = nums.length + 1;
        
        while(end != preSum.length){
        	if(preSum[end] - preSum[start] < s || start == end){
        		end++;
        	} else if(preSum[end] - preSum[start] >= s){
        		min = Math.min(end - start, min);
        		start++;
        	}
        }
        
        return min == nums.length + 1 ? 0 : min;
        
    }
}
