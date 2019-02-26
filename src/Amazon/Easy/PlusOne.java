package Amazon.Easy;
/**
 * LeetCode 66
 * @author kokonatsudream
 *
 */
public class PlusOne {
	public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length - 1; i >= 0; i--) {
        	if(digits[i] == 9) {
        		digits[i] = 0;
        		carry = 1;
        	} else {
        		digits[i] = digits[i] + carry;
        		carry = 0;
        		break;
        	}
        }
        if(carry == 1) {
        	int[] res = new int[digits.length + 1];
        	res[0] = 1;
        	for(int i = 0; i < digits.length; i++) {
        		res[i+1] = digits[i];
        	}
            digits = res;
        }
        return digits;
    }
}
