package LinkedList;
/**
 * Given a (singly) linked list with head node root, write a function to split the linked list into k consecutive linked list "parts".

The length of each part should be as equal as possible: no two parts should have a size differing by more than 1. This may lead to some parts being null.

The parts should be in order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal parts occurring later.

Return a List of ListNode's representing the linked list parts that are formed.

Examples 1->2->3->4, k = 5 // 5 equal parts [ [1], [2], [3], [4], null ]
 * @author kokonatsudream
 *
 */
public class SplitLinkedList {
	
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	}
	 
	public ListNode[] splitListToParts(ListNode root, int k) {
		ListNode curr = root;
		int len = 0;
        while(curr != null) {
        	curr = curr.next;
        	len++;
        }
        
        ListNode[] parts = new ListNode[k];
        
        if(len == 0) return parts;
        
        int partSize = 1;
        int extra = 0;
        
        if(len > k) {
        	partSize = len /k;
        	extra = len % k;
        }
        
        curr = root;
        for(int i = 0; i < k; i++) {
        	ListNode part = curr;
        	
        	if(extra > 0) {
        		curr = split(curr, partSize + 1);
        		extra--;
        	} else {
        		curr = split(curr, partSize);
        	}
        	parts[i] = part;
        }
        
        return parts;
    }
	private ListNode split(ListNode n, int size) {
		if(n == null) return null;
		
		while(size > 1) {
			n = n.next;
			size--;
		}
		
		ListNode rem = n.next;
		n.next = null;
		
		return rem;
	}
}
