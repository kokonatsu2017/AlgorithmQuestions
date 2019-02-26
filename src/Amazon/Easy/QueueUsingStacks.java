package Amazon.Easy;

import java.util.Stack;
/**
 * LeetCode 232
 * @author kokonatsudream
 *
 */
public class QueueUsingStacks {
	private Stack newStack;
	private Stack old;
	/** Initialize your data structure here. */
    public QueueUsingStacks() {
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
