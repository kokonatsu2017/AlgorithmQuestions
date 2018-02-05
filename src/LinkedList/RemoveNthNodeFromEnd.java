package LinkedList;
/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * @author Kerjohn
 *
 */
public class RemoveNthNodeFromEnd {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(2);
		dummy.next = head;
		
		ListNode fast = dummy;
		ListNode slow = dummy;
        
        while(fast.next != null){
        	fast = fast.next;
        	if(n <= 0) slow = slow.next;
            n--;
            
        }
        
        if(slow.next != null) slow.next = slow.next.next;
        
        return dummy.next;
    }
}
