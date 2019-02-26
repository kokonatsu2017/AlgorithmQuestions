package Amazon.Easy;
/**
 * LeetCode 121
 * @author kokonatsudream
 *
 */
public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
        int profit = 0;
        int lowest = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
        	if(lowest > prices[i]){
        		lowest = prices[i];
        	}
        	int earned = prices[i] - lowest;
        	if(earned > profit)
        		profit = earned;
        }
        return profit;
    }
}
