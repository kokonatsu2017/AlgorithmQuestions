package Array;
/**
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place and use only constant extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.

1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1
 * @author kokonatsudream
 *
 */
public class nextPermutation {
	public void nextPermutation(int[] nums) {
        if(nums.length <= 1) return;
        
        int index = nums.length - 1;
        for(; index > 0; index--) {
        	if(nums[index] > nums[index - 1]) break;
        }
        
        if(index != 0) {
        	swap(nums, index - 1);
        }
        
        reverse(nums, index);
    }
	public void swap(int[] nums, int i) {
		for(int j = nums.length - 1; j >= i; j--) {
			if(nums[j] > nums[i]) {
				int tmp = nums[j];
				nums[j] = nums[i];
				nums[i] = tmp;
				break;
			}
		}
	}
	
	public void reverse(int[] nums, int i) {
		int first = i;
		int last = nums.length - 1;
		
		while(first < last) {
			int tmp = nums[first];
			nums[first] = nums[last];
			nums[last] = tmp;
			first++;
			last--;
		}
	}
}
