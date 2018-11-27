package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 448
 * @author kokonatsudream
 *
 */
public class FindAllNumbersDisappered {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<>();
		
        for(int i = 0; i < nums.length; i++){
        	int val = Math.abs(nums[i]) - 1;
        	if(nums[val] > 0){
        	    nums[val] = -nums[val];
            }
        }
        
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] > 0){
        		res.add(i + 1);
        	}
        }
        
        return res;
    }
}
