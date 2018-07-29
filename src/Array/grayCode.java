package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

00 - 0
01 - 1
11 - 3
10 - 2
 * @author kokonatsudream
 *
 */
public class grayCode {
	public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> existedNum = new HashSet<Integer>();
        
        res.add(0);
        existedNum.add(0);
       
        for(int i = 1; i < 1 << n; i ++) {
        	int k = res.get(i - 1);
        	
        	for(int j = 0; j < n; j++) {
        		if(existedNum.add(k ^ 1 <<j)) {
        			res.add(k ^ 1 <<j);
        			break;
        		}
        	}
        }
        
        return res;
	}
}
