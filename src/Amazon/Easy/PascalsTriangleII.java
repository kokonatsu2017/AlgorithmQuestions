package Amazon.Easy;

import java.util.ArrayList;
import java.util.List;
/**
 * LeetCode 118
 * @author kokonatsudream
 *
 */
public class PascalsTriangleII {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i = 0; i < numRows; i++){
        	res.add(i, new ArrayList<>(i + 1));
        	
        	for(int j = 0; j <= i; j++){
        		if(j == 0 || j == i){
        			res.get(i).add(j, 1);
        		} else {
        			int newVal = res.get(i-1).get(j-1) + res.get(i-1).get(j);
        			res.get(i).add(j, newVal);
        		}
        	}
        }
        
        return res;
    }
}
