package Array;
import java.util.ArrayList;
import java.util.List;

public class Permutations {
	/**
	 * Given a collection of distinct numbers, return all possible permutations.
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if(nums == null || nums.length == 0) {
        	return lists;
        }
        dfs(nums, lists, new ArrayList<Integer>());
        return lists;
    }  
	
	public void dfs(int[] nums, List<List<Integer>> lists, List<Integer> list) {
		if(list.size() == nums.length) {
			List<Integer> res = new ArrayList<>(list);
			lists.add(res);
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(list.contains(nums[i])) continue;
			
			list.add(nums[i]);
			dfs(nums, lists, list);
			list.remove(list.size() - 1);
		}
	}
}
