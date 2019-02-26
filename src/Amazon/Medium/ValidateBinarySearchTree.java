package Amazon.Medium;

import lib.TreeNode;

/**
 * LeetCode 98
 * @author kokonatsudream
 *
 */
public class ValidateBinarySearchTree {
	public class TreeNode {
		  int val;
		  TreeNode left;
		  TreeNode right;
		  TreeNode(int x) { val = x; }
	}
	
	public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
	
	public boolean isValidBST(TreeNode node, long max, long min){
		if(node == null) return true;
		
		if(node.val >= max || node.val <= min)
			return false;
		
		return isValidBST(node.left, node.val, min) && isValidBST(node.right, max, node.val);
			
	}
	
}
