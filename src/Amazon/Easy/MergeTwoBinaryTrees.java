package Easy;
/**
 * LeetCode 617
 * @author kokonatsudream
 *
 */
public class MergeTwoBinaryTrees {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null){
        	return null;
        } else if(t1 == null && t2 != null){
        	t1 = new TreeNode(t2.val);
        } else if(t1 != null && t2 != null){
        	t1.val += t2.val;
        } else {
        	return t1;
        }
        
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        
        return t1;
    }
}
