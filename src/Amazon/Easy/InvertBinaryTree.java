package Easy;

import lib.TreeNode;

/**
 * LeetCode 226
 * @author kokonatsudream
 *
 */
public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		if(root == null) return null;
		
        TreeNode newNode = new TreeNode(root.val);
        
        newNode.left = invertTree(root.right);
        newNode.right = invertTree(root.left);
        
        return newNode;
    }
	
}
