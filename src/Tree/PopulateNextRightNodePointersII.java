package Tree;

import java.util.LinkedList;

import Tree.PopulateNextRightNodePointers.TreeLinkNode;

/**
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Note:

You may only use constant extra space.
Recursive approach is fine, implicit stack space does not count as extra space for this problem.
Example:

Given the following binary tree,

     1
   /  \
  2    3
 / \    \
4   5    7
After calling your function, the tree should look like:

     1 -> NULL
   /  \
  2 -> 3 -> NULL
 / \    \
4-> 5 -> 7 -> NULL

 * @author kokonatsudream
 *
 */
public class PopulateNextRightNodePointersII {
	public class TreeLinkNode {
	      int val;
	      TreeLinkNode left, right, next;
	      TreeLinkNode(int x) { val = x; }
	}
	
	public void connect(TreeLinkNode root) {
        if(root == null) return;
        
        LinkedList<TreeLinkNode> q = new LinkedList<>();
        
        q.add(root);
        TreeLinkNode curr = root;
        
        while(q.size() != 0) {
        	LinkedList<TreeLinkNode> parent = q;
        	q = new LinkedList<TreeLinkNode>();
        	
        	curr.next = null;
        	
        	for(TreeLinkNode n: parent) {
        		if(n.left != null) {
        			if(q.size() != 0)
        				curr.next = n.left;
        			q.add(n.left);
        			curr = n.left;
        		}
        		if(n.right != null) {
        			if(q.size() != 0)
        				curr.next = n.right;
        			q.add(n.right);
        			curr = n.right;
        		}
        	}
        }
    }
}
