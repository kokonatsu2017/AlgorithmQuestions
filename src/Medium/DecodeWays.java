package Medium;
/**
 * LeetCode 91
 * @author kokonatsudream
 *
 */
public class DecodeWays {
	public int numDecodings(String s) {
		
        int[] dp = new int[s.length() + 1];
        
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        
        for(int i = 2; i <= s.length(); i++){
        	//X -> X0 - k-1, Xk
        	if(s.charAt(i - 1) - '0' > 0){
        		dp[i] += dp[i - 1];
        	}
        	int twoDigits = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
        	
        	//X -> X0 - k-2, Xk-1Xk
        	if(twoDigits >= 10 && twoDigits <= 26){
        		dp[i] += dp[i - 2];
        	}
        }
        
        return dp[s.length()];
    }
}
