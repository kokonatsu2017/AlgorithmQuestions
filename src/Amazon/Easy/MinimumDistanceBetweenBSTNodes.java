package Amazon.Easy;

import lib.TreeNode;
/**
 * Leetode 783
 * @author kokonatsudream
 *
 */
public class MinimumDistanceBetweenBSTNodes {
	int min = Integer.MAX_VALUE;
	int prev = 0;
	public int minDiffInBST(TreeNode root) {
        
        traverseTree(root);
        
        return min;
        
    }
	
	public void traverseTree(TreeNode n){
		if(n == null) return;
		
		traverseTree(n.left);
		
		if(prev != 0){
			int diff = n.val - prev;
			if(min > diff) min = diff;
		}
		
		prev = n.val;
		
		traverseTree(n.right);
	}
}
