package Medium;

import java.util.ArrayList;
import java.util.List;

import lib.TreeNode;
/**
 * LeetCode 129
 * @author kokonatsudream
 *
 */
public class SumRoofToLeafNumber {
	public int sumNumbers(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        
        getNumber(root, 0, nums);
        
        int sum = 0;
        for(int num : nums){
        	sum += num;
        }
        
        return sum;
        
    }
	public void getNumber(TreeNode n, int sum, List<Integer> nums){
		if(n == null){
			return;
		}
		
		sum = sum * 10 + n.val;
		if(n.left != null){
			getNumber(n.left, sum, nums);
		}
		if(n.right != null){
			getNumber(n.right, sum, nums);
		}
		
		if(n.left == null && n.right == null){
			nums.add(sum);
		}
	}
}
