package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array without duplicates, return the summary of its ranges.

Example 1:

Input:  [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.
Example 2:

Input:  [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: 2,3,4 form a continuous range; 8,9 form a continuous range.
 * @author kokonatsudream
 *
 */
public class SummaryRange {
	public List<String> summaryRanges(int[] nums) {
		int start = 0;
		int end = 0;
		
		List<String> list = new ArrayList<>();
        
        if(nums.length == 0){
            return list;
        }else if(nums.length == 1){
            addRange(list, nums[start], nums[end]);
            return list;
        }
		
        for(int i = 1; i < nums.length; i++) {
        	if(nums[i] - nums[i-1] == 1) {
        		end = i;
        	} else {
        		addRange(list, nums[start], nums[end]);
                start = i;
                end = i;
        	}
        }
        
        addRange(list, nums[start], nums[end]);
        
        return list;
    }
	
	public void addRange(List<String> list, int start, int end) {
		if(start == end) {
			list.add(Integer.toString(start));
		} else {
			list.add(Integer.toString(start) + "->" + Integer.toString(end));
		}
	}
}
