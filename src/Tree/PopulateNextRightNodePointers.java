package Tree;
/**
 * 
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.
 * 
 * Given the following perfect binary tree,

     1
   /  \
  2    3
 / \  / \
4  5  6  7
After calling your function, the tree should look like:

     1 -> NULL
   /  \
  2 -> 3 -> NULL
 / \  / \
4->5->6->7 -> NULL
 * @author kokonatsudream
 *
 */
public class PopulateNextRightNodePointers {
	public class TreeLinkNode {
	      int val;
	      TreeLinkNode left, right, next;
	      TreeLinkNode(int x) { val = x; }
	}
	
	public void connect(TreeLinkNode root) {
        if(root == null) return;
        merge(root.left, root.right);
    }
	
	public void merge(TreeLinkNode left, TreeLinkNode right) {
		if(left == null || right == null) return;
		
		left.next = right;
		merge(left.left, left.right);
		merge(left.right, right.left);
		merge(right.left, right.right);
	}
}
