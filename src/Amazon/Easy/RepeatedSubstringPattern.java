package Amazon.Easy;

/**
 * LeetCode 459
 * @author kokonatsudream
 *
 */
public class RepeatedSubstringPattern {
	public boolean repeatedSubstringPattern(String s) {
        String ss = s + s;
        
        return ss.substring(1, ss.length() -1).contains(s);
    }
}
