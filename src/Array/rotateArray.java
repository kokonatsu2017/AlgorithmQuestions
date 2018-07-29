package Array;


public class rotateArray {
	/**
	 * Rotate an array of n elements to the right by k steps.

		For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is 
		rotated to [5,6,7,1,2,3,4].
	 * @param nums
	 * @param k
	 */
	public void rotate(int[] nums, int k) {
        int length = nums.length;
		int[] tmp = new int[length];
        for(int i = 0; i < length; i++) {
        	tmp[(i + k) % length] = nums[i];
        }
        for(int i = 0; i < length; i++) {
        	nums[i] = tmp[i];
        }
        
    }
}
