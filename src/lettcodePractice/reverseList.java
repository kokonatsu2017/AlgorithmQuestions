package lettcodePractice;

public class reverseList {
	
	
	/**
	 * Reverse a singly linked list.
	 * @param head
	 * @return
	 */
	public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return previous;
    }
	public class ListNode{
		ListNode next;
		
		ListNode(){
			next = null;
		}
	}
}
