package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 349
 * @author kokonatsudream
 *
 */
public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<>();
		List<Integer> inter = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
        	if(!list.contains(nums1[i])){
        		list.add(nums1[i]);
        	}
        }
        
        for(int j = 0; j < nums2.length; j++){
        	if(list.contains(nums2[j]) && !inter.contains(nums2[j]))
        		inter.add(nums2[j]);
        }
        
        int[] res = new int[inter.size()];
        for(int i = 0; i < inter.size(); i++){
        	res[i] = inter.get(i);
        }
        
        return res;
    }
}
