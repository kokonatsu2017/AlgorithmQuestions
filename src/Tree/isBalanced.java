package Tree;

/**
 * Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree 
in which the depth of the two subtrees of every node never differ by more than 1.
 * 
 *
 */
public class isBalanced {
	public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        if(Math.abs(height(root.right) - height(root.left)) >= 2){
        	return false;
        } else {
        	return isBalanced(root.right) && isBalanced(root.left);
        }
    }
	
	public int height(TreeNode n){
		if(n == null) return 0;
		
		return Math.max(height(n.left), height(n.right) ) + 1;
	}
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
}
