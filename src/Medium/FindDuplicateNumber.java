package Medium;

/**
 * LeetCode 287
 * @author kokonatsudream
 *
 */
public class FindDuplicateNumber {
	public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
        	int number = Math.abs(nums[i]);
        	
        	if(nums[number - 1] < 0){
        		return number;
        	} else {
        		nums[number - 1] = -nums[number -1];
        	}
        }
        
        return -1;
    }
}
