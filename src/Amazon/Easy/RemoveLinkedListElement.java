package Amazon.Easy;

import lib.ListNode;

public class RemoveLinkedListElement {
	public ListNode removeElements(ListNode head, int val) {
		ListNode current = head;
		ListNode prev = null;
		
        while(current != null){
        	if(current.val == val && prev != null){
        		prev.next = current.next;
        	} else if(current.val == val && prev == null){
                head = current.next;
        	} else {
        		prev = current;
        	}
        	current = current.next;
        }
        
        return head;
    }
}
