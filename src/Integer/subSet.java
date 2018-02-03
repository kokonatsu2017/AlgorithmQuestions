package Integer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSet {
/**
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 * Note: The solution set must not contain duplicate subsets.
 * @param nums
 * @return
 */
	public List<List<Integer>> subsets(int[] nums) {
		List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
        		list.add(nums[i]);
        }
        
        return subsets(list, 0);
        
    }
	
	public List<List<Integer>> subsets(List<Integer> set, int index){
		List<List<Integer>> allsubsets;
		if(set.size() == index){
			allsubsets = new ArrayList<List<Integer>>();
			allsubsets.add(new ArrayList<Integer>());
		} else {
			allsubsets = subsets(set, index + 1);
			int item = set.get(index);
			
			List<List<Integer>> more = new ArrayList<List<Integer>>();
			for(List<Integer> subset : allsubsets){
				List<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(subset);
				newsubset.add(item);
				more.add(newsubset);
			}
			allsubsets.addAll(more);
		}
		return allsubsets;
		
	}
}
