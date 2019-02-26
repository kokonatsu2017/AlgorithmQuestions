package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * LeetCode 350
 * @author kokonatsudream
 *
 */
public class IntersectionOfTwoArraysII {
	public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < nums1.length; i++){
        	map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        
        for(int j = 0; j < nums2.length; j++){
        	if(map.containsKey(nums2[j]) && map.get(nums2[j]) > 0){
        		res.add(nums2[j]);
        		map.put(nums2[j], map.get(nums2[j]) - 1);
        	}
        }
        
        int[] resArray = new int[res.size()];
        
        for(int i = 0; i < resArray.length; i++){
        	resArray[i] = res.get(i);
        }
        
        return resArray;
    }
}
