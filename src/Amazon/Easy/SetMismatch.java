package Amazon.Easy;
/**
 * LeetCode 645
 * @author kokonatsudream
 *
 */
public class SetMismatch {
	public int[] findErrorNums(int[] nums) {
		int total = 0;
		int sum = 0;
		int target = 0;
		
		int[] array = new int[nums.length + 1];
		
        for(int i = 0; i < nums.length; i++){
        	total += i + 1;
        	sum += nums[i];
        	if(array[nums[i]] == 1)
        		target = nums[i];
        	array[nums[i]]++;
        }
        
        int[] res = new int[2];
        
        res[0] = target;
        res[1] = target + total - sum;
        
        return res;
    }
}
