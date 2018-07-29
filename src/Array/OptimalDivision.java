package Array;
/**
 * Given a list of positive integers, the adjacent integers will perform the float division. For example, [2,3,4] -> 2 / 3 / 4.

However, you can add any number of parenthesis at any position to change the priority of operations. You should find out how to add parenthesis to get the maximum result, and return the corresponding expression in string format. Your expression should NOT contain redundant parenthesis.
 * @author Kerry
 *
 */
public class OptimalDivision {
	public String optimalDivision(int[] nums) {
        if(nums == null || nums.length == 0) return "";
        if(nums.length == 1) return nums[0] + "";
        if(nums.length == 2) return nums[0] + "/" + nums[1];
        
        StringBuilder s = new StringBuilder();
        s.append(nums[0] + "/(" + nums[1]);
        
        for(int i = 2; i < nums.length; i++) {
        	s.append('/');
        	s.append(nums[i]);
        }
        
        s.append(")");
        
        return s.toString();
    }
}
