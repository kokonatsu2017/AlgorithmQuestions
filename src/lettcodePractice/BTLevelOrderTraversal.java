import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, 
 * return the level order traversal of its nodes' values. 
 * (ie, from left to right, level by level).
 *
 *
 */
public class BTLevelOrderTraversal {
	
	public class TreeNode {
		      int val;
		     TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null) return res;
		traversal(res, root, 1);
        return res;
    }

	private void traversal(List<List<Integer>> res, TreeNode n, int depth) {
		// TODO Auto-generated method stub
		if(n == null) return;
		
		if(res.size() == depth - 1) {
			List<Integer> level = new ArrayList<Integer>();
			level.add(n.val);
			res.add(level);
		} else if(res.size() >= depth) {
			List<Integer> level = res.get(depth - 1);
			level.add(n.val);
		}
		
		traversal(res, n.left, depth + 1);
		traversal(res, n.right, depth + 1);
	}
}
