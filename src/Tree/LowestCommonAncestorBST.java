package Tree;

public class LowestCommonAncestorBST {
	/**
	 * Given a binary search tree (BST), 
	 * find the lowest common ancestor (LCA) of two given nodes in the BST.
	 * @param root
	 * @param p
	 * @param q
	 * @return
	 */
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	      if(root == null || p == null || q == null) return null;
			
			if(root.val > p.val && root.val > q.val) {
				return lowestCommonAncestor(root.left, p, q);
			}
			
			if(root.val < p.val && root.val < q.val) {
				return lowestCommonAncestor(root.right, p,q);
			}
			
			return root;
				
	}
	public class TreeNode{
		TreeNode left;
		TreeNode right;
		int val;
		TreeNode(int x){
			val = x;
		}
	}
}
