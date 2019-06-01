package Medium;

import java.util.Stack;
/**
 * LeetCode 394
 * @author kokonatsudream
 *
 */
public class DecodeString {
	public String decodeString(String s) {
        String res = "";
		Stack<Integer> countStack = new Stack<>();
		Stack<String> resStack = new Stack<>();
		
		int i = 0;
		while(i < s.length()){
			
			if(Character.isDigit(s.charAt(i))){
				int count = 0;
				while(Character.isDigit(s.charAt(i))){
					count = 10 * count +  (s.charAt(i) - '0');
					i++;
				}
				countStack.push(count);
			} else if(s.charAt(i) == '['){
				resStack.push(res);
				res = "";
				i++;
			} else if(s.charAt(i) == ']'){
				StringBuilder sb = new StringBuilder(resStack.pop());
				int num = countStack.pop();
				for(int j = 0; j < num; j++){
					sb.append(res);
				}
				res = sb.toString();
				i++;
			} else {
				res += s.charAt(i);
				i++;
			}
		}
		
		return res;
    }
	
	
}
