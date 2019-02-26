package Amazon.Easy;

import lib.TreeNode;
/**
 * LeetCode 110
 * @author kokonatsudream
 *
 */
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        if(Math.abs(height(root.right) - height(root.left)) >= 2){
        	return false;
        } else {
        	return isBalanced(root.right) && isBalanced(root.left);
        }
    }
	
	public int height(TreeNode n){
		if(n == null) return 0;
		
		return Math.max(height(n.left), height(n.right) ) + 1;
	}
}
