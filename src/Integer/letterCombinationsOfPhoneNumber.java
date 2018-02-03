package Integer;


import java.util.LinkedList;
import java.util.List;

public class letterCombinationsOfPhoneNumber {

	
	public List<String> letterCombinations(String digits) {
        String[] alp = new String []{"0", "1","abc","def", "ghi","jhl", "mno", "pqrs", "tur", "wxyz"};
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("");
        for(int i = 0; i < digits.length(); i++){
        	int num = Character.getNumericValue(digits.charAt(i));
        	
        	while(queue.peek().length() == i){
        		char[] alphabets = alp[num].toCharArray();
        		for(char c : alphabets){
        			String s = queue.remove();
        			queue.add(s + c);
        		}
        	}
        }
        return queue;
        
    }

}
