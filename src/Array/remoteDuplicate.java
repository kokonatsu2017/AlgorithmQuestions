package Array;


/**
 * Given a sorted array, 
 * remove the duplicates in-place such that each element appear only once and return the new length.

	Do not allocate extra space for another array, 
	you must do this by modifying the input array in-place with O(1) extra memory.
 * 
 *
 */
public class remoteDuplicate {
	public int removeDuplicates(int[] nums) {
        int index = 1;
        
        if(nums == null || nums.length == 0) return 0;
        
		int prev = nums[0];
        for(int i = 1; i < nums.length; i++){
        	if(prev != nums[i]){
        		nums[index] = nums[i];
                prev = nums[i];
        		index++;
        	}
        }
        return index;
    }
}
