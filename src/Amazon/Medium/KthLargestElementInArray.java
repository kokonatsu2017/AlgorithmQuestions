package Amazon;

import java.util.Comparator;
import java.util.PriorityQueue;
/**
 * LeetCode 215
 * @author kokonatsudream
 *
 */
public class KthLargestElementInArray {
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> max_heap = new PriorityQueue(new Comparator<Integer>(){
			public int compare(Integer a, Integer b){
				return b - a;
			}
		});
		
		for(int i: nums){
			max_heap.add(i);
		}
		
		for(int j = 0; j < k - 1; j++){
			max_heap.poll();
		}
		return max_heap.poll();
    }
}
