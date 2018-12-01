package Easy;

import lib.TreeNode;
/**
 * LeetCode 108
 * @author kokonatsudream
 *
 */
public class ConvertSortedArrayToBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums) {
        return constructBST(nums, 0, nums.length - 1);
    }
	
	public TreeNode constructBST(int[] nums, int left, int right){
		if(left > right) return null;
		
		int mid = (left + right) /2;
		
		TreeNode node = new TreeNode(nums[mid]);
		
		node.left = constructBST(nums, left, mid - 1);
		node.right = constructBST(nums, mid + 1, right);
		
		return node;
	}
}
