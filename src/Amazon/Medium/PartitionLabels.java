package Amazon.Medium;

import java.util.ArrayList;
import java.util.List;
/**
 * LeetCode 763
 *  */
public class PartitionLabels {
	public List<Integer> partitionLabels(String S) {
        int[] lastChar = new int[26];
        List<Integer> res = new ArrayList<Integer>();
        
        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            lastChar[c - 'a'] = i;
        }

        int end = 0;
        int start = 0;
        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            end = Math.max(end, lastChar[c - 'a']);

            if(i == end){
                int count = end - start + 1;
                res.add(count);
                start = i + 1;
            }
        }

        return res;
    }
}
