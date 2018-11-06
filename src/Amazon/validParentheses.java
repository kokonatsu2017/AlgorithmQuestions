package Amazon;
/**
 * 
 * LeetCode 20
 * 
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
 * @author kokonatsudream
 *
 */
public class validParentheses {
	public boolean isValid(String s) {
        if(s.isEmpty()) return true;
        
        while(!s.isEmpty()){
        	if(s.contains("()")){
        		s = s.replace("()", "");
        	} else if(s.contains("{}")){
        		s = s.replace("{}", "");
        	} else if(s.contains("[]")){
        		s = s.replace("[]", "");
        	} else {
        		return false;
        	}
        }
        
        return true;
        
    }
}
