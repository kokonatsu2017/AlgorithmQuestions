package Easy;

import lib.TreeNode;
/**
 * LeetCode 104
 * @author kokonatsudream
 *
 */
public class MaxDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        return Math.max(left, right) + 1;
    }
}
