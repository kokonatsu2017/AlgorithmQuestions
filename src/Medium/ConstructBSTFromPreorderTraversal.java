package Medium;

import lib.TreeNode;
/**
 * LeetCode 1008
 * @author kokonatsudream
 *
 */
public class ConstructBSTFromPreorderTraversal {
	int i = 0;
	
    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder, Integer.MAX_VALUE);
    }
    
    public TreeNode bstFromPreorder(int[] preorder, int bound) {
        if(i == preorder.length || preorder[i] >= bound){
            return null;
        }
        
        TreeNode n = new TreeNode(preorder[i]);
        i++;
        
        n.left = bstFromPreorder(preorder, n.val);
        n.right = bstFromPreorder(preorder, bound);
        
        return n;
    }
}
