package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]

 * @author kokonatsudream
 *
 */
public class ZigzagLevelOrderTraversal {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        int level = 0;
        
        List<TreeNode> nodes = new ArrayList<>();
        
        if(root != null) nodes.add(root);
        
        while(nodes.size() > 0) {
        	List<Integer> innerRes = new ArrayList<>();
        	List<TreeNode> next = new ArrayList<>();
        	
        	for(int i = 0; i < nodes.size(); i++) {
        		if(nodes.get(i).left != null) next.add(nodes.get(i).left);
        		if(nodes.get(i).right != null) next.add(nodes.get(i).right);
        		//left to right -> right to left from top level
        		innerRes.add(nodes.get(level % 2 == 0 ? i : nodes.size() - 1 - i).val);
        	}
        	
        	res.add(innerRes);
        	nodes = next;
        	level++;
        }
        
        return res;
    }
}
