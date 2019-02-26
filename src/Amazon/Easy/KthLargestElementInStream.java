package Amazon.Easy;

import java.util.PriorityQueue;

public class KthLargestElementInStream {
	PriorityQueue<Integer> queue;
	int k;
	public KthLargestElementInStream(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>(k);
        
        for(int n: nums){
        	add(n);
        }
    }
    
    public int add(int val) {
        if(queue.size() < k){
        	queue.offer(val);
        } else if(queue.peek() < val){
        	queue.poll();
        	queue.offer(val);
        }
        
        return queue.peek();
    }
}
