package Tree;


/**
 * Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and 
the nodes have the same value.
 * @author Kerjohn
 *
 */
public class isSameTree {
	
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null & q == null) return true;
        else if(p == null) return false;
        else if(q == null) return false;
        
        if(p.val != q.val) return false;
        else{
        	return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        }
    }
	
	public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
	}
}
