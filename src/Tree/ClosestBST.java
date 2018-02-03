package Tree;
/**
 * Given a non-empty binary search tree and a target value, 
 * find the value in the BST that is closest to the target.
 * 
 * Given target value is a floating point.
	You are guaranteed to have only one unique value in the BST that is closest to the target.
 * 
 *
 */
public class ClosestBST {
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	
	 public int closestValue(TreeNode root, double target) {
	        return closestValue(root, target, root.val);
	 }
	 public int closestValue(TreeNode node, double target, int val) {
	        if(node == null) return val;
	        
	        if(Math.abs(node.val - target) < Math.abs(val - target)) val = node.val;
	        
	        if(node.val < target) val = closestValue(node.right, target, val);
	        else if(node.val > target) val = closestValue(node.left, target, val);
	        
	        return val;
	 }
}
