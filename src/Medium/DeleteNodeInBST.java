package Medium;

import lib.TreeNode;
/**
 * LeetCodew 450
 * @author kokonatsudream
 *
 */
public class DeleteNodeInBST {
	public TreeNode deleteNode(TreeNode root, int key) {
		if(root == null){
			return root;
		}
		
		if(root.val > key){
			root.left = deleteNode(root.left, key);
		} else if(root.val < key){
			root.right = deleteNode(root.right, key);
		} else {
			if(root.left == null && root.right == null){
				root = null;
			} else if(root.left == null){
				root = root.right;
			} else if(root.right == null){
				root = root.left;
			} else {
				TreeNode tmp = getMax(root.left);
				root.val = tmp.val;
				root.left = deleteNode(root.left, tmp.val);
			}
		}
		
		return root;
    }
	
	public TreeNode getMax(TreeNode node){
		TreeNode current = node;
		
		while(current.right != null){
			current = current.right;
		}
		
		return current;
	}
}
