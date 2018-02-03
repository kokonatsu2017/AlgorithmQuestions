package Integer;
/**
 * Find the kth largest element in an unsorted array. 
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * 
 * For example, Given [3,2,1,5,6,4] and k = 2, return 5.
 * 
 */
public class kthLargestNumber {
	public int findKthLargest(int[] nums, int k) {
		return findKthLargest(nums, 0, nums.length - 1, nums.length - k);
        
    }
	
	public int findKthLargest(int[] nums, int start, int end, int k) {
		if(start > end) return Integer.MAX_VALUE;
		
		int pivot = nums[end];
		int left = start;
		for(int i = left; i < end; i++) {
			if(nums[i] < pivot) {
				swap(nums, left, i);
				left++;
			}
		}
		swap(nums, left, end);
		
		if(left == k) {
			return nums[left];
		} else if(left < k) {
			return findKthLargest(nums, left + 1, end, k);
		} else {
			return findKthLargest(nums, start, left - 1, k);
		}
	}

	private void swap(int[] nums, int left, int i) {
		// TODO Auto-generated method stub
		int tmp = nums[left];
		nums[left] = nums[i];
		nums[i] = tmp;
	}
}
