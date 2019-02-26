package Amazon.Easy;
/**
 * LeetCode 122
 * @author kokonatsudream
 *
 */
public class BestTimeToBuyAndSell2 {
	public int maxProfit(int[] prices) {
		if(prices.length == 0) return 0;
		
		int[] changes = new int[prices.length - 1];
		
		for(int i = 1; i < prices.length; i++){
			changes[i - 1] = prices[i] - prices[i-1];
		}
		
		int sum = 0;
		for(int change : changes){
			if(change > 0)
				sum += change;
		}
		return sum;
    }
}
