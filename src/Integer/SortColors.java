package Integer;
/**
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.

- A rather straight forward solution is a two-pass algorithm using counting sort.
First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.

- Could you come up with a one-pass algorithm using only constant space?
 * @author kokonatsudream
 *
 */
public class SortColors {
	public void sortColors(int[] nums) {
        int i = 0;
        int low = 0;
        int high = nums.length - 1;
        
        while(i <= high) {
        	if(nums[i] == 0) {
        		if(i == low) {
        			i++;
        			low++;
        		} else {
        			swap(i, low, nums);
        			low++;
        		}
        	} else if(nums[i] == 2) {
        		swap(i, high, nums);
        		high--;
        	} else {
        		i++;
        	}
        }
    }
	
	public void swap(int a, int b, int[] nums) {
		int tmp = nums[a];
		
		nums[a] = nums[b];
		nums[b] = tmp;
	}
}
