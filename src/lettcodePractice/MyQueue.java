import java.util.Stack;
/**
 * Implement the following operations of a queue using stacks.

		push(x) -- Push element x to the back of queue.
		pop() -- Removes the element from in front of queue.
		peek() -- Get the front element.
		empty() -- Return whether the queue is empty.
 * 
 *
 */
public class MyQueue {
	private Stack newStack;
	private Stack old;
	/** Initialize your data structure here. */
    public MyQueue() {
        newStack = new Stack();
        old = new Stack();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
    	newStack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	if(old.isEmpty()) {
    		while(!newStack.isEmpty()) {
    			old.push(newStack.pop());
    		}
    	}
    	
        return (int) old.pop();
    	
    }
    
    /** Get the front element. */
    public int peek() {
    	if(old.isEmpty()) {
    		while(!newStack.isEmpty()) {
    			old.push(newStack.pop());
    		}
    	}
    	return (int) old.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return old.isEmpty() && newStack.isEmpty();
    }
}
