package Easy;
/**
 * LeetCode 268
 * @author kokonatsudream
 *
 */
public class MissingNumber {
	public int missingNumber(int[] nums) {
		int total = 0;
		int sum = 0;
        for(int i = 0; i < nums.length; i++){
        	sum += nums[i];
        	total += i;
        }
        total += nums.length;
        
        return total - sum;
    }
}
