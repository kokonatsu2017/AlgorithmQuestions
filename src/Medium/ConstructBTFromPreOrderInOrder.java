package Medium;

import java.util.HashMap;
import java.util.Map;

import lib.TreeNode;
/**
 * LeetCode 105
 * @author kokonatsudream
 *
 */
public class ConstructBTFromPreOrderInOrder {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		Map<Integer, Integer> idx = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
        	idx.put(inorder[i], i);
        }
        
        return buildTree(preorder, idx, 0, 0, inorder.length - 1);
    }
	/**
	 * 		curr      				start    end
	 * left curr + 1  				start     in - 1
	 * right curr + in - start + 1  in + 1    end
	 * @param preorder
	 * @param idx
	 * @param curr
	 * @param start
	 * @param end
	 * @return
	 */
	public TreeNode buildTree(int[] preorder, Map<Integer, Integer> idx, int curr, int start, int end){
		if(start > end){
			return null;
		}
		TreeNode node = new TreeNode(preorder[curr]);
		
		int in_order_rank = idx.get(preorder[curr]);
		int left_size = in_order_rank - start;
		int right_idx = curr + left_size + 1;
		
		node.left = buildTree(preorder, idx, curr + 1, start, in_order_rank - 1);
		node.right = buildTree(preorder, idx, right_idx, in_order_rank + 1, end);
		
		return node;
	}
}
