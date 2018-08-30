package Array;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
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
