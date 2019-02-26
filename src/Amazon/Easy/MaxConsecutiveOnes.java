package Easy;

/**
 * LeetCode 485
 * @author kokonatsudream
 *
 */
public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
        int maxOne = 0;
        int currentOne = 0;
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] == 0){
        		if(currentOne > maxOne){
        			maxOne = currentOne;
        		}
        		currentOne = 0;
        	} else {
        		currentOne++;
        	}
        }
        
        if(currentOne > maxOne){
        	maxOne = currentOne;
        }
        
        return maxOne;
    }
}
