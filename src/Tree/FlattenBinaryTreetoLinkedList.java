package Tree;


/**
 * Given a binary tree, flatten it to a linked list in-place.

For example, given the following tree:

    1
   / \
  2   5
 / \   \
3   4   6
The flattened tree should look like:

1
 \
  2
   \
    3
     \
      4
       \
        5
         \
          6
 * @author kokonatsudream
 *
 */
public class FlattenBinaryTreetoLinkedList {
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
	
	TreeNode pre = null;
	
	public void flatten(TreeNode root) {
        if(root == null) return;
        
        TreeNode right = root.right;
        TreeNode left = root.left;
        
        if(pre != null) {
        	pre.right = root;
        } else {
        	pre = root;
        }
        
        pre.left = null;
        flatten(left);
        flatten(right);
    }
}
