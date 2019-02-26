package Amazon.Easy;

import lib.TreeNode;
/**
 * LeetCode 572
 * @author kokonatsudream
 *
 */
public class SubtreeOfAnotherTree {
	public boolean isSubtree(TreeNode s, TreeNode t) {
		
		if(s == null){
        	return false;
        }
		
        if(sameTree(s, t)){
        	return true;
        }
        
        return isSubtree(s.left, t) || isSubtree(s.right, t);
        
    }
	
	public boolean sameTree(TreeNode s, TreeNode t){
		if(s == null && t == null){
			return true;
		}
		
		if(s == null || t == null){
			return false;
		}
		
		if(s.val != t.val){
			return false;
		}
			
		return sameTree(s.left, t.left) && sameTree(s.right, t.right);
	}
}
