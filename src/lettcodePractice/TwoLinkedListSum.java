
public class TwoLinkedListSum {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
	}
	
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        ListNode prev = new ListNode(0);
			ListNode head = prev;
			
			int carry = 0;
			while(l1 != null | l2 != null | carry != 0) {
				int sum = 0;
				ListNode current = new ListNode(0);
				if(l1 != null) {
					sum += l1.val;
					l1 =l1.next;
				}
				if(l2 != null) {
					sum += l2.val;
	                l2 = l2.next;
				}
				sum += carry;
				current.val = sum % 10;
				carry = sum/10;
				
				prev.next = current;
				prev = current;
			}
			return head.next;
	    }
}
