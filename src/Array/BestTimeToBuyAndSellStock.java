package Array;


public class BestTimeToBuyAndSellStock {
	/**
	 * If you were only permitted to complete at most one transaction, 
	 * design an algorithm to find the maximum profit.
	 * Input: [7, 1, 5, 3, 6, 4]
	 * Output: 5
	 * difference = 6-1 = 5
	 * @param prices
	 * @return
	 */
	public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }else {
                if(prices[i] - min > profit){
                    profit = prices[i] - min;
                }
            }
            
        }
        return profit;
    }
}
