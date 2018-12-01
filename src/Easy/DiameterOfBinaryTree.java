package Easy;

import lib.TreeNode;

/**
 * LeetCode 543
 * @author kokonatsudream
 *
 */
public class DiameterOfBinaryTree {
	public int diameterOfBinaryTree(TreeNode root) {
		int[] diameter = new int[1];
        
		height(root, diameter);
        
        return diameter[0];
    }
	
	public int height(TreeNode node, int[] diameter){
		if(node == null) return 0;
		
		int left = height(node.left, diameter);
		int right = height(node.right, diameter);
		
		diameter[0] = Math.max(diameter[0], left + right);
		
		return 1 + Math.max(left, right);
		
	}
	
}
