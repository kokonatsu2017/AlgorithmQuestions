package Medium;
/**
 * LeetCode 81
 * @author kokonatsudream
 *
 */
public class SearchInRotatedSortedArray2 {
	public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high){
        	int mid = (low + high) /2;
        	
        	if(nums[mid] == target){
        		return true;
        	}
        	
        	if(nums[mid] < nums[high]){
        		if(nums[mid] < target && target <= nums[high]){
        			low = mid + 1;
        		} else {
        			high = mid - 1;
        		}
        	} else if(nums[mid] > nums[low]){
        		if(nums[mid] > target && target >= nums[low]){
        			high = mid - 1;
        		} else {
        			low = mid + 1;
        		}
        	} else if(nums[mid] == nums[low]){
        		low++;
        	} else if(nums[mid] == nums[high]){
        		high--;
        	}
        }
        return false;
    }
	
	
}
