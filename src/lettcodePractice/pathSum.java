/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
 * @author kjnchen
 *
 */
public class pathSum {
	public class TreeNode {
		     int val;
		      TreeNode left;
		      TreeNode right;
		     TreeNode(int x) { val = x; }
		  }
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
