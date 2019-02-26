package Easy;
/**
 *LeetCode 21
 *
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 * @author kokonatsudream
 *
 */
public class MergeTwoSortedLists {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode resHead = null;
        ListNode current = null;
        
        if(l1 == null)
            return l2;
        else if(l2 == null)
            return l1;
        
        while(l1 != null && l2 != null){
        	if(resHead == null){
        		if(l1.val < l2.val){
        			current = l1;
        			l1 = l1.next;
        		} else {
        			current = l2;
        			l2 = l2.next;
        		}
        		resHead = current;
        	}else{
                if(l1.val < l2.val){
                    current.next = l1;
                    l1 = l1.next;
                } else {
                    current.next = l2;
                    l2 = l2.next;
                }
                current = current.next;
            }
        }
        
        if(l1 != null){
        	current.next = l1;
        } else if(l2 != null){
        	current.next = l2;
        }
        
        return resHead;
    }
}
