package Medium;

import lib.ListNode;
/**
 * LeetCode 86
 * @author kokonatsudream
 *
 */
public class PartitionList {
	public ListNode partition(ListNode head, int x) {
		
		if(head == null || head.next == null){
			return head;
		}
		
        ListNode lNodes = null;
        ListNode rNodes = null;
        ListNode rHead = new ListNode(-1);
        ListNode lHead = new ListNode(-1);
        
        lNodes = lHead;
        rNodes = rHead;
        
        while(head != null){
        	if(head.val < x){
        		lNodes.next = head;
        		lNodes = lNodes.next;
        		lNodes.next = null;
        	} else {
        		rNodes.next = head;
        		rNodes = rNodes.next;
        		rNodes.next = null;
        	}
        	head = head.next;
        }
        lNodes.next = rHead.next;
        
        return lHead.next;
    }
}
