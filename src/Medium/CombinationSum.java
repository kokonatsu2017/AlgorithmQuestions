package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 39
 * @author kokonatsudream
 *
 */
public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        
        backtrack(res, new ArrayList<>(), candidates,target, 0);
        
        return res;
        
    }
	
	public void backtrack(List<List<Integer>> res, List<Integer> temp, int[] candidates, int target, int start){
		if(target < 0){
			return;
		} else if(target == 0){
			res.add(new ArrayList<>(temp));
		} else {
			for(int i = start; i < candidates.length; i++){
				temp.add(candidates[i]);
				backtrack(res, temp, candidates, target - candidates[i], i);
				temp.remove(temp.size() - 1);
			}
		}
	}
}
