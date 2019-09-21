package Medium;

import java.util.Stack;
/**
 * LeetCode 227
 * @author kokonatsudream
 *
 */
public class BasicCalculator2 {
	public int calculate(String s) {
	       Stack<Integer> stack = new Stack<>();
	        int num = 0;
	        char sign = '+';
	        for(int i = 0; i < s.length(); i++){
	        	char c = s.charAt(i);
	        	if(Character.isDigit(c)){
	        		num = num * 10 + (c - '0');
	        	}
	        	
	        	if( (!Character.isDigit(c) && c != ' ') || i == s.length() - 1){
	        		switch(sign){
	        			case '+':
	        				stack.push(num);
	        				break;
	        			case '-':
	        				stack.push(-num);
	        				break;
	        			case '*':
	        				stack.push(stack.pop() * num);
	        				break;
	        			case '/':
	        				stack.push(stack.pop() / num);
	        				break;
	        		}
	        		sign = c;
	        		num = 0;
	        	}
	        }
	        
	        int sum = 0;
	        while(!stack.isEmpty()){
	        	sum += stack.pop();
	        }
	        
	        return sum;
	    }
}
