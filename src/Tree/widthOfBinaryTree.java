package Tree;

import java.util.LinkedList;
import java.util.Queue;
/**
 * Given a binary tree, write a function to get the maximum width of the given tree. The width of a tree is the maximum width among all levels. The binary tree has the same structure as a full binary tree, but some nodes are null.

The width of one level is defined as the length between the end-nodes (the leftmost and right most non-null nodes in the level, where the null nodes between the end-nodes are also counted into the length calculation.
 * @author kokonatsudream
 *
 */
public class widthOfBinaryTree {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	
	public int widthOfBinaryTree(TreeNode root) {
		
        if(root == null) return 0;
        
        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Integer> indices = new LinkedList<>();
        
        nodes.offer(root);
        indices.offer(1);
        
        int width = 0;
        
        while(!nodes.isEmpty()) {
        	int treeLevelSize = nodes.size();
        	
        	int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            
            for(int i = 0; i < treeLevelSize; i++) {
            	TreeNode n = nodes.poll();
            	int index = indices.poll();
            	
            	if(n != null) {
            		min = Math.min(min, index);
            		max = Math.max(max, index);
            		
            		nodes.offer(n.left);
            		nodes.offer(n.right);
            		
            		indices.offer(2* index);
            		indices.offer(2 * index + 1);
            	}
            }
            
            if(max > min) {
            	width = Math.max(max - min, width);
            }
        	
        }
        
        return width + 1;
    }
}
