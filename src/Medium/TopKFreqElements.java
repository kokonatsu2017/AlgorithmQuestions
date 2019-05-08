package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/***
 * LeetCode 347
 * @author kokonatsudream
 *
 */
public class TopKFreqElements {
	
	public List<Integer> topKFrequent(int[] nums, int k) {
		
		Map<Integer, Integer> map = new HashMap<>();
		PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < nums.length; i++){
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()){
			heap.add(entry);
		}
		
		int index = 0;
		
		while(index < k){
			int val = heap.poll().getKey();
			list.add(val);
			index++;
		}
		
		return list;
		
	 }
            
}
