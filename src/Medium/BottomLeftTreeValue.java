package Medium;

import java.util.LinkedList;
import java.util.Queue;

import lib.TreeNode;
/**
 * LeetCode 513
 * @author kokonatsudream
 *
 */
public class BottomLeftTreeValue {
	public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode current = null;
        
        q.add(root);
        
        while(!q.isEmpty()){
        	current = q.poll();
        	if(current.right != null){
        		q.add(current.right);
        	}
        	
        	if(current.left != null){
        		q.add(current.left);
        	}
        }
        
        return current.val;
        
    }
}
