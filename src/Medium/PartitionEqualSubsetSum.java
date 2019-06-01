package Medium;
/**
 * LeetCode 416
 * @author kokonatsudream
 *
 */
public class PartitionEqualSubsetSum {
	public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i : nums){
        	sum += nums[i];
        }
        
        if(sum % 2 == 1){
        	return false;
        }
        
        boolean[][] dp = new boolean[sum/2 + 1][n + 1];
        
        dp[0][0] = true;
        
        for(int currSum = 0; currSum <= sum/2; currSum++){
        	for(int index = 1; index <= n; index++){
        		if(currSum < nums[index-1]){
        			dp[currSum][index] = dp[currSum][index - 1];
        		} else {
        			dp[currSum][index] = dp[currSum][index - 1] || dp[currSum - nums[index - 1]][index - 1];
        		}
            }
        }
        
        return dp[sum/2][n];
     
    }
}
