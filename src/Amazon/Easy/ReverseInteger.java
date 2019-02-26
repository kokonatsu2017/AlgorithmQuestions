package Amazon.Easy;
/**
 * LeetCode 7
 * @author kokonatsudream
 *
 */
public class ReverseInteger {
	public int reverse(int x) {
		int res = 0;
        
        if(x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE ) return 0;
        
        while(x != 0){
        	int digit = x % 10;
        	x = x / 10;
            
        	if(res > Integer.MAX_VALUE /10 || res < Integer.MIN_VALUE /10 ) return 0;
            
        	res = res * 10 + digit;
        }
        return res;
    }
}
