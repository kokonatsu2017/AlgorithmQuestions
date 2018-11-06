package Amazon;
/**
 * LeetCode 141
 * @author kokonatsudream
 *
 */
public class LinkedListCycle {
	class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	         val = x;
	         next = null;
	      }
	}
	public boolean hasCycle(ListNode head) {
        ListNode faster = head;
        ListNode slower = head;
        
        while(faster != null && faster.next != null){
        	faster = faster.next.next;
        	slower = slower.next;
        	
        	if(faster == slower)
        		return true;
        }
        return false;
    }
}
