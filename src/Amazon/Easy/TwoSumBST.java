package Amazon.Easy;

import java.util.ArrayList;
import java.util.List;

import lib.TreeNode;

/**
 * LeetCode 653
 * @author kokonatsudream
 *
 */
public class TwoSumBST {
	public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        
        return findTarget(root, list, k);
    }
	
	public boolean findTarget(TreeNode node, List<Integer> list, int k){
		if(node == null) return false;
		
		if(list.contains(node.val)) return true;
		
		list.add(k - node.val);
		
		return findTarget(node.left, list, k) || findTarget(node.right, list, k);
		
	}
}
