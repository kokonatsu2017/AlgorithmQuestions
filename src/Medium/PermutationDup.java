package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * LeetCode 47
 * @author kokonatsudream
 *
 */
public class PermutationDup {
	public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), res, new boolean[nums.length]);
        
        return res;
    }
	
	public void backtrack(int[] nums, List<Integer> tmp, List<List<Integer>> res, boolean[] used){
		if(tmp.size() == nums.length){
			res.add(new ArrayList<>(tmp));
		} else {
			for(int i = 0; i < nums.length; i++){
				if(used[i] || i > 0 && nums[i-1] == nums[i] && !used[i - 1]){
					continue;
				} else {
					used[i] = true;
					tmp.add(nums[i]);
					backtrack(nums, tmp, res, used);
					tmp.remove(tmp.size() - 1);
					used[i] = false;
				}
			}
		}
	}
}
