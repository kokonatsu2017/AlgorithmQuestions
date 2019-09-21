package Medium;

import lib.ListNode;
/**
 * LeetCOde 82
 * @author kokonatsudream
 *
 */
public class RemoveDupFromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode newNode = new ListNode(-1);
        ListNode curr = newNode;
        
        while(head != null){
        	if(head.next != null && head.val == head.next.val){
	    		while(head.next != null && head.val == head.next.val){
	    			head = head.next;
	    		}
	    		head = head.next;
        	} else {
        		curr.next = head;
        		curr = curr.next;
        		head = head.next;
        		curr.next = null;
        	}
        }
        
        return newNode.next;
        
    }
}
