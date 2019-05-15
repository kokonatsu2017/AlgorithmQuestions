package Medium;

import lib.TreeNode;
/**
 * LeetCode 623
 * @author kokonatsudream
 *
 */
public class AddOneRowToTree {
	public TreeNode addOneRow(TreeNode root, int v, int d) {
        
        if(d == 1){
			TreeNode newRoot = new TreeNode(v);
			newRoot.left = root;
			
			return newRoot;
		}
        
        addOne(root, v, d, 1);
        
        return root;
    }
	
	public void addOne(TreeNode n, int v, int d, int curr_depth){
		if(n == null){
			return;
		}
		
		if(d - 1 == curr_depth){
			
            TreeNode left_child = n.left;
            TreeNode newLeft = new TreeNode(v);
            n.left = newLeft;
            newLeft.left = left_child;
				
		
            TreeNode right_child = n.right;
            TreeNode newRight = new TreeNode(v);
            n.right = newRight;
            newRight.right = right_child;
			
			
			
			return;
		} else {
			addOne(n.left, v, d, curr_depth + 1);
			addOne(n.right, v, d, curr_depth + 1);
		}
	}
}
