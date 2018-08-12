package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.


 * @author kokonatsudream
 *
 */
public class BSTIterator {
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
	
	Queue<TreeNode> list;
	
	public BSTIterator(TreeNode root) {
        list = new LinkedList<>();
        travel(root);
    }
	
	public void travel(TreeNode root) {
		if(root == null) return;
		travel(root.left);
		list.add(root);
		travel(root.right);
	}

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !list.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        int res = 0;
        if(hasNext()) {
        	res = list.poll().val;
        }
        
        return res;
    }
}
