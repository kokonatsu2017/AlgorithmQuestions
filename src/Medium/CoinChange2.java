package Medium;

/**
 * LeetCode 518
 * @author kokonatsudream
 *
 */
public class CoinChange2 {
	public int change(int amount, int[] coins) {
		int[] dp = new int[amount + 1];
		dp[0] = 1;
        for(int coin : coins){
        	for(int total = coin; total <= amount; total++){
        		dp[total] += dp[total - coin];
        	}
        }
        
        return dp[amount];
    }
}
