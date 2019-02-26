package Amazon.Medium;

import java.util.ArrayList;
import java.util.List;
/**
 * LeetCode Subsets
 * @author kokonatsudream
 *
 */
public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
        return subsets(nums, 0);
    }
	
	public List<List<Integer>> subsets(int[] nums, int index){
		List<List<Integer>> total;
		
		if(nums.length == index){
			total = new ArrayList<>();
			total.add(new ArrayList<Integer>());
		} else {
			total = subsets(nums, index + 1);
			
			int item = nums[index];
			List<List<Integer>> more = new ArrayList<>();
			
			for(List<Integer> subset: total){
				List<Integer> newSubset = new ArrayList<Integer>();
				
				newSubset.addAll(subset);
				newSubset.add(item);
				more.add(newSubset);
			}
			
			total.addAll(more);
		}
		
		return total; 
	}
}
