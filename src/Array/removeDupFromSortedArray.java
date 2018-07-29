package Array;

public class removeDupFromSortedArray {
	/**
	 * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

		Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums) {
		int i = 0;
        for(int num : nums) {
        	if(i == 0 || num > nums[i-1]) {
        		nums[i] = num;
        		i++;
        	}
        }
        return i;
    }
}
