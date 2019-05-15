package Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 46
 * @author kokonatsudream
 *
 */
public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> used = new ArrayList<>();
        backtrack(nums, res, new ArrayList<>(), used);
        
        return res;
    }
	
	public void backtrack(int[] nums, List<List<Integer>> res,  List<Integer> list,
			 List<Integer> used){
		if(nums.length == list.size()){
			res.add(new ArrayList<>(list));
		} else {
			for(int i = 0; i < nums.length; i++){
				if(!used.contains(nums[i])){
					list.add(nums[i]);
					used.add(nums[i]);
					backtrack(nums, res, list,used);
					used.remove(used.size() - 1);
					list.remove(list.size() - 1);
				}
			}
		}
	}
}
