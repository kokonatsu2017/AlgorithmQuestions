package Integer;

public class missingNum {
	/**
	 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, 
	 * find the one that is missing from the array.
	 * @param nums
	 * @return
	 */
	 public int missingNumber(int[] nums) {
		 int sum = 0;
		 for(int i : nums) {
			 sum += i;
		 }
		 int total = (nums.length + 1) * nums.length / 2;
		 
		 return total - sum;
	 }
}
