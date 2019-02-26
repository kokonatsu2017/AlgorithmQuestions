package Amazon.Medium;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 138
 * @author kokonatsudream
 *
 */
public class CopyListWithRandomPointer {
	class RandomListNode {
	     int label;
	     RandomListNode next, random;
	     RandomListNode(int x) { this.label = x; }
	};
	
	public RandomListNode copyRandomList(RandomListNode head) {
		Map<RandomListNode, RandomListNode> nodeTracker = new HashMap<>();
        
        RandomListNode current = head;
        while(current != null){
        	nodeTracker.put(current, new RandomListNode(current.label));
        	current = current.next;
        }
        current = head;
        while(current != null){
        	nodeTracker.get(current).next = nodeTracker.get(current.next);
        	nodeTracker.get(current).random = nodeTracker.get(current.random);
        	current = current.next;
        }
        
        return nodeTracker.get(head);
    }
	
}
