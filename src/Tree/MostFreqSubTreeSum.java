package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given the root of a tree, you are asked to find the most frequent subtree sum. The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself). So what is the most frequent subtree sum value? 
 * If there is a tie, return all the values with the highest frequency in any order.
 * @author Kerry
 *
 */
public class MostFreqSubTreeSum {
	public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
	}
	
	public int[] findFrequentTreeSum(TreeNode root) {
        if(root == null) return new int[0];
        
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        
        List<Integer> res = new ArrayList<Integer>();
        
        sum(root, freq);
        
        int max = 0;
        for(Map.Entry<Integer, Integer> m: freq.entrySet()) {
        	if(m.getValue() >= max) max = m.getValue();
        }
        for(Map.Entry<Integer, Integer> m: freq.entrySet()) {
        	if(m.getValue() == max) res.add(m.getKey());
        }
        
        int[] resArray = new int[res.size()];
        
        int i = 0;
        for(int n : res) {
        	resArray[i++] = n;
        }
        
        return resArray;
        	
    }
	
	private int sum(TreeNode n, Map<Integer, Integer> freq) {
		if(n.left == null && n.right == null) {
			freq.put(n.val, freq.getOrDefault(n.val, 0) + 1);
			return n.val;
		}
		
		int l=0, r=0, sum=0;
		
		if(n.left != null) {
			l = sum(n.left, freq);
		}
		
		if(n.right != null) {
			r = sum(n.right, freq);
		}
		
		sum = l + r + n.val;
		
		freq.put(sum, freq.getOrDefault(sum, 0) + 1);
		
		return sum;
	}
}
