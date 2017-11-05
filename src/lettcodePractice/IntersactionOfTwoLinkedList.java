package lettcodePractice;

public class IntersactionOfTwoLinkedList {
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
	/**
	 * Write a program to find the node at 
	 * which the intersection of two singly linked lists begins.
	 * @param headA
	 * @param headB
	 * @return
	 */
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	       if(headA == null || headB == null) return null;
			
			int lengthA = 1;
			int lengthB = 1;
			ListNode a = headA;
			ListNode b = headB;
			
			while(a.next != null) {
				a = a.next;
				lengthA++;
			}
			while(b.next != null) {
				b = b.next;
				lengthB++;
			}
			if(a != b) return null;
			
			int diff = lengthA - lengthB;
			if(diff > 0) {
				while(diff > 0) {
					headA = headA.next;
					diff--;
				}
			} else {
				while(diff < 0) {
					headB = headB.next;
					diff++;
				}
			}
			
			while(headA != headB) {
				headA = headA.next;
				headB = headB.next;
			}
			return headA;
	    }
}
