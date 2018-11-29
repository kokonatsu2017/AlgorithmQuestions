package Easy;

import lib.ListNode;
/**
 * LeetCode 237
 * @author kokonatsudream
 *
 */
public class DeleteNodeInLinkedList {
	public void deleteNode(ListNode node) {
        ListNode next = node.next;
        if(next != null){
	        node.val = node.next.val;
	        node.next = node.next.next;
        } else {
        	node = null;
        }
    }
}
