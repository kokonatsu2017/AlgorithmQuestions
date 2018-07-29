package Tree;

import Tree.ConvertBSTToGreaterTree.TreeNode;

/**
 * Given inorder and postorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

For example, given

inorder = [9,3,15,20,7]
postorder = [9,15,7,20,3]
Return the following binary tree:

    3
   / \
  9  20
    /  \
   15   7
 * @author kokonatsudream
 *
 */
public class BInaryTreeFromInOrderAndPostOrder {
	public class TreeNode {
	      int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	}
	// inorder -> left, root, right
	// postotder -> left, right, root
	
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, inorder.length - 1, 0, postorder, postorder.length - 1);
    }
	
	public TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart) {
        if(postStart < 0 || inStart < inEnd)
        	return null;
        
        TreeNode root = new TreeNode(postorder[postStart]);
        
        int index = inStart;
        for(int i = inStart; i >= inEnd; i--) {
        	if(inorder[i] == postorder[postStart]) {
        		index = i;
        		break;
        	}
        }
        
        root.right = buildTree(inorder, inStart, index + 1, postorder, postStart - 1);
        root.left = buildTree(inorder, index-1, inEnd, postorder, postStart - (inStart - index) - 1);
        
        return root;
    }
}
