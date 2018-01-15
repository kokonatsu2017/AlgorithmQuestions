package lettcodePractice;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.

 *
 */
public class isPalindrome {
	public boolean isPalindrome(int x) {
		int reversed = 0;
        int orig = x;
        while(x > 0){
        	int digit = x % 10;
        	reversed = reversed * 10 + digit;
        	x = x /10;
        }
        return orig == reversed;
    }
}
