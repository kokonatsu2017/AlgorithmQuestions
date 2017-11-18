
public class mergeSortedArray {
	/**
	 * Given two sorted integer arrays nums1 and nums2, 
	 * merge nums2 into nums1 as one sorted array.
	 * 
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i1 = m - 1;
		int i2 = n - 1;
		int current = nums1.length - 1;
        while(current >= 0){
        	if(i1 < 0){
        		nums1[current] = nums2[i2];
        		i2--;
        	} else if(i2 < 0){
        		nums1[current] = nums1[i1];
        		i1--;
        	} else {
        		if(nums1[i1] >= nums2[i2]){
        			nums1[current] = nums1[i1];
        			i1--;
        		} else {
        			nums1[current] = nums2[i2];
        			i2--;
        		}
        	}
        	current--;
        }
    }
}
