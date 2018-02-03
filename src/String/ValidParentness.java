package String;


public class ValidParentness {
	/**
	 * Given a string containing just the characters
	 * '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	 * 
	 * The brackets must close in the correct order, 
	 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
	 * @param s
	 * @return
	 */
	 public boolean isValid(String s) {
	        while(!s.equals("")){
	            if(s.contains("()")){
	                s = s.replace("()", "");
	            } else if(s.contains("[]")){
	                s = s.replace("[]", "");
	            } else if(s.contains("{}")){
	                s = s.replace("{}", "");
	            }else{
	                return false;
	            }
	        }
	        return true;
	    }
}
