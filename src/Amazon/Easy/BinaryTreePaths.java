package Amazon.Easy;

import java.util.ArrayList;
import java.util.List;

import lib.TreeNode;

/**
 * LeetCode 257
 * @author kokonatsudream
 *
 */
public class BinaryTreePaths {
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
