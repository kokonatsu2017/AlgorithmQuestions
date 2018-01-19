package lettcodePractice;

public class sortedArrayToBST {
	/**
	 * Given an array where elements are sorted in ascending order, 
	 * convert it to a height balanced BST.

		For this problem, a height-balanced binary tree is defined as a binary tree 
		in which the depth of the two subtrees of every node never differ by more than 1.
	 * 
	 */
	 public TreeNode sortedArrayToBST(int[] nums) {
		 return makeBST(nums, 0, nums.length - 1);
	 }
	 public TreeNode makeBST(int[] nums, int start, int end){
		 if(start > end) return null;
		 int m = (start + end) /2;
		 
		 TreeNode n = new TreeNode(nums[m]);
		 
		 n.left = makeBST(nums, start, m - 1);
		 n.right = makeBST(nums, m + 1, end);
		 
		 return n;
	 }
	 public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
}
