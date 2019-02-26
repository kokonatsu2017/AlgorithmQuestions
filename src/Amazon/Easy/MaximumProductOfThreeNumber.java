package Easy;
/**
 * LeetCode 628
 * @author kokonatsudream
 *
 */
public class MaximumProductOfThreeNumber {
	public int maximumProduct(int[] nums) {
		int low = Math.min(nums[0], nums[1]);
		int high = Math.max(nums[0], nums[1]);
		
		int maxProduct = low * high;
		int minProduct = low * high;
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 2; i < nums.length; i++){
			max = Math.max(max, (nums[i] < 0 ) ? nums[i] * minProduct : nums[i] * maxProduct);
			
			maxProduct = Math.max(maxProduct, (nums[i] < 0) ? nums[i] * low : nums[i] * high);
			minProduct = Math.min(minProduct, (nums[i] < 0) ? nums[i] * high : nums[i] * low);
			
			high = Math.max(high, nums[i]);
			low = Math.min(low, nums[i]);
		}
		
		return max;
    }
}
