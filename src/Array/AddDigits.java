package Array;

public class AddDigits {
	/**
	 * Given a non-negative integer num, 
	 * repeatedly add all its digits until the result has only one digit.
		For example:
		Given num = 38, the process is like: 3 + 8 = 11, 
		1 + 1 = 2. Since 2 has only one digit, return it.
	 * @param num
	 * @return
	 */
	public int addDigits(int num) {
		
        while(num / 10 >= 1) {
        	int sum = 0;
        	int integer = num;
        	while(integer > 0) {
        		sum += integer % 10;
        		integer = integer / 10;
        	}
        	num = sum;
        }
        return num;
    }
	
	public int addDigitsRec(int num) {
		
		if(num==0)
	        return 0;
	    return (num%10) + addDigitsRec(num/10);
    }
}
