package String;


/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 *
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
			return "";
        
        String str = strs[0];
        
        for(int i = 1; i < strs.length; i++){
        	while(strs[i].indexOf(str) != 0){
        		str = str.substring(0, str.length() - 1);
        	}
        }
        return str;
    }		
}
