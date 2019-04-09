package Medium;

/**
 * LeetCode 791
 */
public class customSortString {
    public String customSortString(String S, String T) {
        StringBuilder res = new StringBuilder();
        int[] added = new int[T.length()];

        for (char c : S.toCharArray()) {
            for (int i = 0; i < T.length(); i++) {
                if (T.charAt(i) == c) {
                    res.append(T.charAt(i));
                    added[i] = 1;
                }
            }
        }

        for (int i = 0; i < T.length(); i++) {
            if (added[i] == 0) {
                res.append(T.charAt(i));
            }
        }

        return res.toString();
    }
}