package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * @author kokonatsudream
 *
 */
public class BinaryTreeInOrderTraversal {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		     TreeNode(int x) { val = x; }
	}
	//Recrusive Solution
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		inOrder(root, res);	
        return res;
    }
	
	public void inOrder(TreeNode n, List<Integer> res) {
		if(n == null) return;
		
		inOrder(n.left, res);
		res.add(n.val);
		inOrder(n.right, res);
	}
	
	//Iterative Solution
	public List<Integer> inorderTraversalIter(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		TreeNode cur = root;
		while(cur != null || !stack.isEmpty()) {
			while(cur != null) {
				stack.push(cur);
				cur = cur.left;
			}
			
			cur = stack.pop();
			res.add(cur.val);
			cur = cur.right;
		}
		
		return res;
	}
}
