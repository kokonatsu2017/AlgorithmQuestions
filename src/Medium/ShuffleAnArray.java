package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * LeetCode 384
 * @author kokonatsudream
 *
 */
public class ShuffleAnArray {
	
	private int[] original;
	private int[] current;
	private Random r;
	
	public ShuffleAnArray(int[] nums){
		original = nums;
		current = nums;
		r = new Random();
		
	}

	public int[] reset() {
		
        current = original;
        
        return current;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        List<Integer> nums = new ArrayList<>();
        int[] res = new int[current.length];
        
        for(int i = 0; i < current.length; i++){
        	nums.add(current[i]);
        }
        
        int j = 0;
        
        while(nums.size() > 0){
        	int index = r.nextInt(nums.size());
        	res[j] = nums.remove(index);
        	j++;
        }
        
        current = res;
        
        return current;
    }
}
