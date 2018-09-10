package Array;

/**
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

Example 1:

Input: n = 12
Output: 3 
Explanation: 12 = 4 + 4 + 4.
Example 2:

Input: n = 13
Output: 2
Explanation: 13 = 4 + 9.
 * @author kokonatsudream
 *
 */
public class PerfectSquare {
	public int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++) {
        	dp[i] = square(dp, i);
        }
        
        return dp[n];
    }
	
	public int square(int[] dp, int i) {
		int min = Integer.MAX_VALUE;
		int closet = (int)Math.sqrt(i);
		
		while(closet >= 1) {
			min = Math.min(min, 1 + dp[i - closet * closet]);
			closet--;
		}
		return min;
	}
	
}
