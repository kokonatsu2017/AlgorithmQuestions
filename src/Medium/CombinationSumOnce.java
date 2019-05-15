package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * LeetCode 40
 * @author kokonatsudream
 *
 */
public class CombinationSumOnce {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, res, new ArrayList<>(), target, 0);
        
        return res;
    }
	
	public void backtrack(int[] candidates, List<List<Integer>> res, List<Integer> tmp, int target, int start){
		if(target < 0){
			return;
		} else if(target == 0){
			res.add(new ArrayList<>(tmp));
		} else{
			for(int i = start; i < candidates.length; i++){
				if(i > start && candidates[i - 1] == candidates[i]){
					continue;
				}
				tmp.add(candidates[i]);
				backtrack(candidates, res, tmp, target - candidates[i], i + 1);
				tmp.remove(tmp.size() - 1);
			}
		}
	}
}

