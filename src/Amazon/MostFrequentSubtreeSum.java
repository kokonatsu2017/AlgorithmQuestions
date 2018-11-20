package Amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lib.TreeNode;

/**
 * LeetCode 508
 * @author kokonatsudream
 *
 */
public class MostFrequentSubtreeSum {
	
	public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        findSum(root, map);
        
        int max = 0;
        for(int freq : map.values()){
        	if(freq > max){
        		max = freq;
        	}
        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        	if(entry.getValue() == max){
        		res.add(entry.getKey());
        	}
        
        }
        int[] resArray = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
        	resArray[i] = res.get(i);
        }
        
        return resArray;
    }
	
	private int findSum(TreeNode node, Map<Integer, Integer> map){
		if(node == null) return 0;
		
		int sum = findSum(node.left, map) + findSum(node.right, map) + node.val;
		
		map.put(sum, map.getOrDefault(sum, 0) + 1);
		
		return sum;
		
	}
}
