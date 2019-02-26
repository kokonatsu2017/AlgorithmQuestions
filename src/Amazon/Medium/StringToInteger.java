package Amazon;
/**
 * LeetCode 8 
 * @author kokonatsudream
 *
 */
public class StringToInteger {
	public int myAtoi(String str) {
		
		if(str.isEmpty()) return 0;
		
        long res = 0;
        int sign = 1;
        int i = 0;
       
        while(str.charAt(i) == ' '){
        	i++;
            if(i >= str.length()) return 0;
        }
        
        if(str.charAt(i) == '-'){
        	sign = -1;
        	i++;
        } else if (str.charAt(i) == '+'){
            i++;
        } else if (str.charAt(i) < '0' || str.charAt(i) > '9'){
        	return 0;
        }
       
        while(i < str.length()){
        	if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
        		res = res * 10 + (str.charAt(i) - '0');
        	} else {
        		return (int)res * sign;
        	}
            if(sign == 1 && res > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && (-1)*res < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        	i++;
        }
   
        return (int) res * sign;
    }

}
