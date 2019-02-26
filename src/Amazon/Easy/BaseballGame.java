package Amazon.Easy;

import java.util.Stack;

/**
 * LeetCode 682
 * @author kokonatsudream
 *
 */
public class BaseballGame {
	public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i = 0; i < ops.length; i++){
        	if(ops[i].equals("+")){
        		int last = stack.pop();
        		int secondLast = stack.peek();
        		sum += last + secondLast;
        		stack.push(last);
        		stack.push(last + secondLast);
        	} else if(ops[i].equals("D")){
        		int val = stack.peek();
        		sum += val * 2;
        		stack.push(val * 2);
        	} else if(ops[i].equals("C")){
        		int val = stack.pop();
        		sum -= val;
        	} else {
        		stack.push(Integer.parseInt(ops[i]));
        		sum += Integer.parseInt(ops[i]);
        	}
        }
        
        return sum;
    }
}
