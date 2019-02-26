package Amazon.Medium;

import java.util.LinkedList;
import java.util.List;

/**
 * LeetCode 17
 * @author kokonatsudream
 *
 */
public class LetterCombinationOfPhoneNumber {
	public List<String> letterCombinations(String digits) {
		
		
        LinkedList<String> queue = new LinkedList<String>();
        
        if(digits.isEmpty()) return queue;
        
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi","jkl", "mno", "pqrs", "tuv", 
        		"wxyz"};
        
        queue.add("");
        
        while(queue.peek().length() != digits.length()){
        	String item = queue.remove();
        	String map = mapping[digits.charAt(item.length()) - '0'];
        	
        	for(int i = 0; i < map.length(); i++){
        		queue.add(item + map.charAt(i));
        	}
        }
        
        return queue;
    }
}
