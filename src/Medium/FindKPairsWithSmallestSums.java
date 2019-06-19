package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * LeetCode 373
 * @author kokonatsudream
 *
 */
public class FindKPairsWithSmallestSums {
	public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int []> min_heap = new PriorityQueue<>(
        		(a, b) -> a[0] + a[1] - b[0] - b[1]);
        	
        for(int i : nums1){
        	for(int j : nums2){
        		min_heap.add(new int[]{i, j});
        	}
        }
        
        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        while(!min_heap.isEmpty() && i < k){
        	int[] pair = min_heap.poll();
        	
        	List<Integer> res_pair = new ArrayList<>();
        	res_pair.add(pair[0]);
        	res_pair.add(pair[1]);
        	
        	res.add(res_pair);
        	i++;
        }
        
       return res;
        
    }
}
