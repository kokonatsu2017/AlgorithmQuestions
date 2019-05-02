package Medium;

import java.util.ArrayList;
import java.util.List;
/**
 * LettCode 442
 * @author kokonatsudream
 *
 */
public class FindAllDuplicatesInArray {
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
        	int num = Math.abs(nums[i]);
        	
        	if(nums[num - 1] < 0){
        		res.add(num);
        	} else {
        		nums[num - 1] = -nums[num - 1];
        	}
        }
        
        return res;
    }
}
