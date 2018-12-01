package Easy;
/**
 * LeetCode 9
 * @author kokonatsudream
 *
 */
public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		if (x < 0) {
            return false;
        }
        String str = x + "";
        int i = 0, j = str.length() - 1;
        while (i < j) {
            char left = str.charAt(i);
            char right = str.charAt(j);
            if (left != right) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
