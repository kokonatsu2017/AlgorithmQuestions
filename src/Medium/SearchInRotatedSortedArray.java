package Medium;
/**
 * LeetCode 33
 * @author kokonatsudream
 *
 */
public class SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high){
        	int mid = (low + high) /2;
        	
        	if(nums[mid] == target){
        		return mid;
        	}
        	
        	if(nums[mid] < nums[high]){
        		if(nums[mid] < target && target <= nums[high]){
        			low = mid + 1;
        		} else {
        			high = mid - 1;
        		}
        	} else {
        		if(nums[mid] > target && target >= nums[low]){
        			high = mid - 1;
        		} else {
        			low = mid + 1;
        		}
        	}
        }
        
        return -1;
    }
}
