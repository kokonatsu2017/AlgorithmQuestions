package Amazon.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 * LeetCode 155
 * @author kokonatsudream
 *
 */
public class MinStack {
	int min = Integer.MAX_VALUE;
	Stack<Integer> stack = new Stack<>();
	public void push(int x){
		if(x <= min){
			stack.push(min);
			min = x;
		}
		stack.push(x);
	}
	
	public void pop(){
		if(stack.peek() == min){
			stack.pop();
			min = stack.pop();
		} else {
			stack.pop();
		}
	}
	
	public int top(){
		return stack.peek();
	}
	
	public int getMin(){
		return min;
	}
}
