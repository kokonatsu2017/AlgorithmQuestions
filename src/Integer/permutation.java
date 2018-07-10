package Integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.

Example:

Input: [1,1,2]
Output:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
 * @author kokonatsudream
 *
 */
public class permutation {
	public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        permutationUnique(nums, l, new LinkedHashMap<>());
        return l;
    }
	
	public static void permutationUnique(int[] nums, List<List<Integer>> ls, LinkedHashMap<Integer, Integer> m){
		
		if(m.size() == nums.length) {
			ls.add(new ArrayList<>(m.values()));
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(!m.containsKey(i) && (i == nums.length-1 || nums[i] != nums[i+1] || (nums[i] == nums[i+1] && m.containsKey(i+1) ))) {
				m.put(i, nums[i]);
				permutationUnique(nums, ls, m);
				m.remove(i);
			}
		}
	}
}
