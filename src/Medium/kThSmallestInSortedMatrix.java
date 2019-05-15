package Medium;

import java.util.PriorityQueue;
/**
 * LeetCode 378
 * @author kokonatsudream
 *
 */
public class kThSmallestInSortedMatrix {
	public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> min_heap = new PriorityQueue<>(k, (o1,o2) ->
        	matrix[o1[0]][o1[1]] - matrix[o2[0]][o2[1]]);
        
        int count = 0;
        min_heap.offer(new int[]{0,0});
        
        while(true){
        	int[] element = min_heap.poll();
        	count++;
        	
        	if(count == k){
        		return matrix[element[0]][element[1]];
        	}
        	
        	if(element[0] == 0 && element[1] + 1 < matrix.length){
        		min_heap.offer(new int[]{0, element[1] + 1});
        	}
        	
        	if(element[0] + 1 < matrix.length){
        		min_heap.offer(new int[]{element[0] + 1, element[1]});
        	}
        }
    }
}
