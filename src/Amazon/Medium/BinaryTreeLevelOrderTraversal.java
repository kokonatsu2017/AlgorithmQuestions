package Amazon;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import lib.TreeNode;

/**
 * LeetCode 102
 * @author kokonatsudream
 *
 */
public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null) return res;
        
        queue.add(root);
        
        while(!queue.isEmpty()){
        	List<Integer> level = new ArrayList<>();
        	int length = queue.size();
        	
        	for(int i = 0; i < length; i++){
        		TreeNode node = queue.poll();
        		level.add(node.val);
        		if(node.left != null) queue.add(node.left);
        		if(node.right != null) queue.add(node.right);
        	}
        	
        	res.add(level);
        }
        
        return res;
    }
}
