package Medium;

import lib.ListNode;
/**
 * LeetCode 92
 * @author kokonatsudream
 *
 */
public class ReverseLinkedList {
	public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null){
        	return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        for(int i = 1; i <= m; i++){
        	if(i == m){
        		curr.next = reversePart(curr.next, n - m + 1);
        	}
        	curr = curr.next;
        }
        
        return dummy.next;
        
    }
	
	public ListNode reversePart(ListNode node, int len){
		if(len == 1){
			return node;
		}
		int i = 0;
		ListNode prev = null;
		ListNode curr = node;
		ListNode next = null;
		while(i < len){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			i++;
		}
		
		node.next = curr;
		
		return prev;
	}
}
