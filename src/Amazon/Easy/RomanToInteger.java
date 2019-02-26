package Easy;

import java.util.HashMap;
/**
 * LeetCode 13
 * @author kokonatsudream
 *
 */
public class RomanToInteger {
	public int romanToInt(String s) {
		
		if(s.length() == 0){
			return 0;
		}
		
		HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
	    
		hashMap.put('I',1);
	    hashMap.put('V',5);
	    hashMap.put('X',10);
	    hashMap.put('L',50);
	    hashMap.put('C',100);
	    hashMap.put('D',500);
	    hashMap.put('M',1000);
	    
	    int lastVal = hashMap.get(s.charAt(s.length() - 1));
	    int sum = lastVal;
	    
	    for(int i = s.length() - 2; i >= 0; i--){
	    	int currVal = hashMap.get(s.charAt(i));
	    	
	    	if(currVal < lastVal){
	    		sum -= currVal;
	    	} else {
	    		sum += currVal;
	    	}
	    	
	    	lastVal = currVal;
	    }
	    
	    return sum;
    }
}
