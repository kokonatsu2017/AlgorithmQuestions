package Array;

import java.util.Arrays;

/**
 * You are given n pairs of numbers. In every pair, the first number is always smaller than the second number.

Now, we define a pair (c, d) can follow another pair (a, b) if and only if b < c. Chain of pairs can be formed in this fashion.

Given a set of pairs, find the length longest chain which can be formed. You needn't use up all the given pairs. You can select pairs in any order.
 * @author kokonatsudream
 *
 */
public class MaxLenPairChain {
	public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b) -> a[1] - b[1]);
        
        int count = 1;
        int end = pairs[0][1];
        
        for(int i = 0; i < pairs.length; i++) {
        	if(pairs[i][0] > end) {
        		count++;
        		end = pairs[i][1];
        	}
        }
        return count;
    }
}
