package Tree;

/**
 * Given a binary search tree with non-negative values, 
 * find the minimum absolute difference between values of any two nodes.
 *
 *
 */
public class minAbsoluteDifference {
	TreeNode prev = null;
	int min = Integer.MAX_VALUE;
	
	public int getMinimumDifference(TreeNode root) {
		inOrder(root);
		return min;
	}
		 
	public void inOrder(TreeNode n){
        if(n == null) return;
		 inOrder(n.left);
		 if(prev != null) min = Math.min(min, Math.abs(prev.val - n.val));
		 prev = n;
		 inOrder(n.right);
	}
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
}
