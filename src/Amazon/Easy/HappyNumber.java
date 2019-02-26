package Amazon.Easy;

import java.util.HashSet;
import java.util.Set;
/**
 * LeetCode 202
 * @author kokonatsudream
 *
 */
public class HappyNumber {
	public boolean isHappy(int n) {
        
        Set valueSeen = new HashSet<>();
        
        while(n != 1){
        	if(!valueSeen.add(n)){
        		return false;
        	} 
        	
        	int res = 0;
        	
        	while(n != 0){
        		int remainder = n % 10;
        		res += remainder * remainder;
        		n /= 10;
        	}
        	
        	n = res;
        }
        
        return true;
    }
}
