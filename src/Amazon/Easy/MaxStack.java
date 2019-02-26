package Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
/**
 * LeetCode 716
 * 
 * Design a max stack that supports push, pop, top, peekMax and popMax.

push(x) -- Push element x onto stack.
pop() -- Remove the element on top of the stack and return it.
top() -- Get the element on the top.
peekMax() -- Retrieve the maximum element in the stack.
popMax() -- Retrieve the maximum element in the stack, and remove it. If you find more than one maximum elements, only remove the top-most one.
Example 1:
MaxStack stack = new MaxStack();
stack.push(5); 
stack.push(1);
stack.push(5);
stack.top(); -> 5
stack.popMax(); -> 5
stack.top(); -> 1
stack.peekMax(); -> 5
stack.pop(); -> 1
stack.top(); -> 5
 * @author kokonatsudream
 *
 */
public class MaxStack {
	/** initialize your data structure here. */
	PriorityQueue<Integer> queue;
	List<Integer> list;
	
    public MaxStack() {
        queue = new PriorityQueue<>((Integer a, Integer b) -> (b - a));
        list = new ArrayList<>();
    }
    
    public void push(int x) {
        queue.add(x);
        list.add(x);
    }
    
    public int pop() {
        int res = this.top();
        queue.remove(list.get(list.size() - 1));
        list.remove(list.size() - 1);
        
        return res;
    }
    
    public int top() {
        return list.get(list.size() - 1);
    }
    
    public int peekMax() {
        return queue.peek();
    }
    
    public int popMax() {
        int res = queue.poll();
        list.remove(list.lastIndexOf(res));
        
        return res;
    }
}

