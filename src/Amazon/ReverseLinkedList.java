package Amazon;
/**
 * LeetCode 206
 * @author kokonatsudream
 *
 */
public class ReverseLinkedList {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode reverseList(ListNode head) {
		
		if(head == null || head.next == null)
			return head;
		
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        
        while(current != null){
        	next = current.next;
        	current.next = prev;
        	
        	prev = current;
        	current = next;
        	
        }
        
        return prev;
    }
	
}
