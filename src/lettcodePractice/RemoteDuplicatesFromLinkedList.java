package lettcodePractice;
/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 * @author Kerjohn
 *
 */
public class RemoteDuplicatesFromLinkedList {
     public ListNode deleteDuplicates(ListNode head) {
    	if(head == null || head.next == null) return head;
    	
    	ListNode curr = head;
    	while(curr.next != null){
    		if(curr.next.val == curr.val){
    			curr.next = curr.next.next;
    		} else {
    			curr = curr.next;
    		}
    	}
		return head;
        
     }

	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
}
