package Amazon.Easy;

public class RemoveDuplicatesFromSortedArray {
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
