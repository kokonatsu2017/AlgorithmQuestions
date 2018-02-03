package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
/**
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 */
public class InOrderTraversal {
	
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
	 public List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer> res = new ArrayList<Integer>();
	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        TreeNode curr = root;
	        
	        while(curr != null || !stack.isEmpty()) {
	        	while(curr != null) {
	        		stack.add(curr);
	        		curr = curr.left;
	        	}
	        	curr = stack.pop();
	        	res.add(curr.val);
	        	curr = curr.right;
	        }
	        
	        return res;
	 }
	 
	 public void inorderTraversalRecursion(TreeNode root) {
			if(root !=  null) {
				inorderTraversalRecursion(root.left);
				//Visit the node by Printing the node data  
				System.out.printf("%d ",root.val);
				inorderTraversalRecursion(root.right);
			}
		}
	 
}
