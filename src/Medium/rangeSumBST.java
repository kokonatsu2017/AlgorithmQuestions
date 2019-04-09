package Medium;

import lib.TreeNode;
/**
 * LeetCode 938
 * @author kokonatsudream
 *
 */
public class rangeSumBST {
	public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if(root == null){
            return 0;
        }
        if(L <= root.val && root.val <= R){
            sum += root.val;
            sum += rangeSumBST(root.left, L, R);
            sum += rangeSumBST(root.right, L, R);
        } else if(root.val > R){
            sum += rangeSumBST(root.left, L, R);
        } else if(root.val < L){
            sum += rangeSumBST(root.right, L, R);
        }
        
        return sum;
    }
}
