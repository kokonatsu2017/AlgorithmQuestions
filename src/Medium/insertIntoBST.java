package Medium;

import lib.TreeNode;

/**
 * LeetCode 701
 * @author kokonatsudream
 *
 */
public class insertIntoBST {
	public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        if(root.val < val){
            TreeNode newNode = insertIntoBST(root.right, val);
            if(root.right == null){
                root.right = newNode;
            }
        } else {
            TreeNode newNode = insertIntoBST(root.left, val);
            if(root.left == null){
                root.left = newNode;
            }
        }
        
        return root;
    }
}
