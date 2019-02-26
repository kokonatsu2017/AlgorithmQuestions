package Amazon.Easy;

import java.util.Stack;

/**
 * LeetCode 234
 * @author kokonatsudream
 *
 */
public class PalindromeLinkedList {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { 
	    	  val = x; 
	      }
	}
	
	public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        
        ListNode faster = head;
        ListNode slower = head;
        
        while(faster != null && faster.next != null){
        	stack.push(slower.val);
        	faster = faster.next.next;
        	slower = slower.next;
        }
        
        if(faster != null){
        	slower = slower.next;
        }
        
        while(slower != null){
        	int val = stack.pop();
        	if(val != slower.val){
        		return false;
        	}
        	slower = slower.next;
        }
        
        return true;
    }
	
}
