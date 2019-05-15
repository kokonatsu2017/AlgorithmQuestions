package Medium;
/**
 * LeetCode 486
 * @author kokonatsudream
 *
 */
public class PredictWinner {
	public boolean PredictTheWinner(int[] nums) {
		
		Integer[][] dp = new Integer[nums.length][nums.length];
		
		return PredictWinner(nums, 0, nums.length - 1, dp) >= 0;
    }
	
	public int PredictWinner(int[] nums, int i, int j, Integer[][] dp){
		if(i > j){
			return 0;
		}
		
		if(dp[i][j] != null){
			return dp[i][j];
		}
		
		dp[i][j] = Math.max(nums[i] - PredictWinner(nums, i + 1, j, dp), nums[j] - PredictWinner(nums, i, j - 1, dp));
		
		return dp[i][j];
		
	}
}
