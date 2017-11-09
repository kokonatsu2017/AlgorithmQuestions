
public class atoi {
	/**
	 * Implement atoi to convert a string to an integer.
	 * @param str
	 * @return
	 */
	public int myAtoi(String str) {
		if(str.length()== 0) return 0;
		str = str.trim();
		
		int sign = 1;
		long sum = 0;
		int currIdx = 0;
		char signMark = str.charAt(0);
		
		if(signMark == '-'){
			sign = -1;
			currIdx++;
		} else if(signMark == '+'){
			sign = 1;
			currIdx++;
		}
		
		for(int i = currIdx; i < str.length(); i++){
			int digit = str.charAt(i) - '0';
			if(digit > 9 || digit < 0) return (int)sum * sign;
			
			sum = sum * 10 + digit;
			
			if(sign == 1 && sum > Integer.MAX_VALUE)return Integer.MAX_VALUE;
			if(sign == -1 && -1  * sum < Integer.MIN_VALUE) return Integer.MIN_VALUE;
		}
		return (int) sum * sign;
        
    }
}
