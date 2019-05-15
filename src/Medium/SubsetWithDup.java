package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * LeetCode 90
 * @author kokonatsudream
 *
 */
public class SubsetWithDup {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, res, new ArrayList<Integer>(), 0);
        
        return res;
    }
	
	public void backtrack(int[] nums, List<List<Integer>> res, List<Integer> temp, int start){
		res.add(new ArrayList(temp));
		for(int i = start; i < nums.length; i++){
			if(i > start && nums[i-1] == nums[i]){
				continue;
			}
			temp.add(nums[i]);
			backtrack(nums, res, temp, i + 1);
			temp.remove(temp.size() - 1);
		}
	}
}
