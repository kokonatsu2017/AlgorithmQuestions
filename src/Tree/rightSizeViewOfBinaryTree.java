package Tree;
import java.util.ArrayList;
import java.util.List;

public class rightSizeViewOfBinaryTree {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	
	/**
	 * Given a binary tree, imagine yourself standing on the right side of it, 
	 * return the values of the nodes you can see ordered from top to bottom.
	 * @param root
	 * @return
	 */
	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        rightSideView(res, root, 0);
		return res;
    }
	
	public void rightSideView( List<Integer> res, TreeNode root, int depth) {
		if(root == null) return;
		
		if(res.size() == depth) {
			res.add(root.val);
		}
		
		rightSideView(res, root.right, depth +1);
		rightSideView(res, root.left, depth +1);
	}
	
}
