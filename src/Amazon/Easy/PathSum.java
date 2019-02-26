package Easy;

import lib.TreeNode;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
        return hasPathSum(root, sum, 0);
    }
	
	private boolean hasPathSum(TreeNode root, int target, int current) {
		if(root == null) return false;
		
		current = current + root.val;
		if(current == target && root.left == null &&root.right == null) return true;
		else {
			return hasPathSum(root.right, target, current) || hasPathSum(root.left, target,current);
		}
	}
}
