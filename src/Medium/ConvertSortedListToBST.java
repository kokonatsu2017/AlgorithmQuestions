package Medium;

import lib.ListNode;
import lib.TreeNode;
/**
 * LeetCode 109
 * @author kokonatsudream
 *
 */
public class ConvertSortedListToBST {
	public TreeNode sortedListToBST(ListNode head) {
        ListNode current = head;
        int len = 0;
        while(current != null){
        	current = current.next;
        	len++;
        }
        
        int[] nodes = new int[len];
        current = head;
        int index = 0;
        while(current != null){
        	nodes[index] = current.val;
        	current = current.next;
        	index++;
        }
        
        return makeBST(0, len, nodes);
        
        
    }
	
	public TreeNode makeBST(int start, int end,  int[] nodes){
		if(start >= end){
			return null;
		}
		
		int mid = (start + end)/2;
		
		TreeNode node = new TreeNode(nodes[mid]);
		
		node.left = makeBST(start, mid, nodes);
		node.right = makeBST(mid + 1, end, nodes);
		
		return node;
	}
}
