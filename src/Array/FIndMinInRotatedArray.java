package Array;
/**
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

Find the minimum element.

You may assume no duplicate exists in the array.

Example 1:

Input: [3,4,5,1,2] 
Output: 1
Example 2:

Input: [4,5,6,7,0,1,2]
Output: 0

 * @author kokonatsudream
 *
 */
public class FIndMinInRotatedArray {
	public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        
        while(l < r ) {
        	int mid = (l + r)/2;
        	
        	if(nums[mid] > nums[mid +1]) return nums[mid + 1];
        	
        	if(nums[r] > nums[mid]) {
        		r = mid;
        	} else {
        		l = mid + 1;
        	}
        }
        
        return nums[l];
    }
}
