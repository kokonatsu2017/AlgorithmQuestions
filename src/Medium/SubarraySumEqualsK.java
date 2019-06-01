package Medium;

import java.util.HashMap;
import java.util.Map;
/**
 * LeetCode 560
 * @author kokonatsudream
 *
 */
public class SubarraySumEqualsK {
	public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1);
        
        int count = 0;
        int sum = 0;
        //sum(i,j) = sum(0,j) - sum(0,i)
        // k = sum - pastSum
        for(int num: nums){
        	sum += num;
        	int target = sum - k;
        	
        	if(sumMap.containsKey(target)){
        		count += sumMap.get(target);
        	}
        	
        	if(sumMap.containsKey(sum)){
        		sumMap.put(sum, sumMap.get(sum) + 1);
        	} else {
        		sumMap.put(sum,  1);
        	}
        }
        
        return count;
    }
}
