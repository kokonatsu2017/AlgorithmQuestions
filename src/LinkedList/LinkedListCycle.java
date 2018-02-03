package LinkedList;


public class LinkedListCycle {
	/**
	 * Given a linked list, determine if it has a cycle in it.
	 * @param head
	 * @return
	 */
	public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        
        ListNode fast = head;
        ListNode slow = head;
        
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
            
        }
        return false;
    }
	class ListNode {
		     int val;
		     ListNode next;
		     ListNode(int x) {
		         val = x;
		         next = null;
		     }
	}
}
