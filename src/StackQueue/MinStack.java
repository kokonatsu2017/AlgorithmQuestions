package StackQueue;


import java.util.Stack;
/**
 * Design a stack that supports push, pop, top, and 
 * retrieving the minimum element in constant time.

	push(x) -- Push element x onto stack.
	pop() -- Removes the element on top of the stack.
	top() -- Get the top element.
	getMin() -- Retrieve the minimum element in the stack.
 * @author Kerjohn
 *
 */
public class MinStack {
	int min = Integer.MAX_VALUE;
    Stack<Integer> s;
    
    public MinStack() {
       s = new Stack<Integer>();
       
    }
    
    public void push(int x) {
       if(x <= getMin()){
           s.push(min);
           min = x;
       } 
       s.push(x);
       
    }
    
    public void pop() {
        int val = s.pop();
        if(val == min) min = s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
         return min;
    }
}
