package LinkedList;


import java.util.Stack;

public class PalindromeLinkedList {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	/*
	 * Given a singly linked list, determine if it is a palindrome.
	 */
	public boolean isPalindrome(ListNode head) {
        ListNode faster = head;
        ListNode shorter = head;
        Stack<Integer> s = new Stack<Integer>();
        if(head == null) return true;
        
        while(faster != null && faster.next != null){
            faster = faster.next.next;
            s.push(shorter.val);
            shorter = shorter.next;
        }
        if(faster != null){
            shorter = shorter.next;
        }
        while(shorter != null){
            
            if(s.pop() != shorter.val){
                return false;
            }
            shorter = shorter.next;
        }
        return true;
    }
}
