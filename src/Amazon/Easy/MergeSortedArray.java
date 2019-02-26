package Amazon.Easy;
/**
 * LeetCode 88
 * @author kokonatsudream
 *
 */
public class MergeSortedArray {
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
