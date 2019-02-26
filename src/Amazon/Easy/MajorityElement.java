package Easy;

import java.util.HashMap;
import java.util.Map;
/**
 * LeetCode 169
 * @author kokonatsudream
 *
 */
public class MajorityElement {
	public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
        	map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        	if(map.get(nums[i]) > nums.length /2){
        		return nums[i];
        	}
        }
        
        return -1;
    }
}
