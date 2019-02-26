package Amazon.Easy;

import lib.TreeNode;

/**
 * LeetCode 669
 * @author kokonatsudream
 *
 */
public class TrimABinarySearchTree {
	public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null) return root;
        
        TreeNode left = trimBST(root.left, L, R);
        TreeNode right = trimBST(root.right, L, R);
        
        if(root.val >= L && root.val <= R){
        	root.left = left;
        	root.right = right;
        	return root;
        } else {
        	if(right != null) return right;
        	if(left != null) return left;
        	
        	return null;
        }
        
    }
}
