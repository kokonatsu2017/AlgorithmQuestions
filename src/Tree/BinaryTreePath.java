package Tree;

import java.util.ArrayList;
import java.util.List;
/**
 * Given a binary tree, return all root-to-leaf paths.

Note: A leaf is a node with no children.

Example:

Input:

   1
 /   \
2     3
 \
  5

Output: ["1->2->5", "1->3"]

Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 * @author kokonatsudream
 *
 */
public class BinaryTreePath {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	
	public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
       if(root == null)
           return res;
        getPath(root, "", res );
        
        return res;
    }
	public void getPath(TreeNode node, String curr, List<String> res) {
		if(curr.length() != 0)
			curr += "->";
		curr += node.val;
		
		if(node.right == null && node.left == null) {
			res.add(curr.toString());
			return;
		}
		if(node.left != null) {
			getPath(node.left, curr, res);
		}
		
		if(node.right != null) {
			getPath(node.right, curr, res);
		} 	
	}
}
