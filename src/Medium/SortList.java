package Medium;

import lib.ListNode;
/**
 * LeetCode 148
 * @author kokonatsudream
 *
 */
public class SortList {
	public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
        	return head;
        }
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast.next != null && fast.next.next != null){
        	fast = fast.next.next;
        	slow = slow.next;
        }
        
        ListNode right = slow.next;
        slow.next = null;
        
        return merge(sortList(head), sortList(right));
    }
	
	public ListNode merge(ListNode left, ListNode right){
		ListNode dummy = new ListNode(Integer.MIN_VALUE);
		ListNode curr = dummy;
		
		while(left != null && right != null){
			if(left.val <= right.val){
				curr.next = left;
				left = left.next;
			} else {
				curr.next = right;
				right = right.next;
			}
			curr = curr.next;
		}
		
		if(left != null){
			curr.next = left;
		} else {
			curr.next = right;
		}
		
		return dummy.next;
	}
}
