package Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import lib.TreeNode;

/**
 * LeetCode 637
 * @author kokonatsudream
 *
 */
public class AverageOfLevelsInBinaryTree {
	public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> averages = new ArrayList<>();
        
        int size = 1;
        queue.add(root);
        
        while(!queue.isEmpty()){
        	double sum = 0;
        	int level = 0;
        	
        	for(int i = 0; i < size; i++){
        		TreeNode node = queue.poll();
        		sum += node.val;
        		
        		if(node.left != null){
        			queue.add(node.left);
        			level++;
        		}
        		if(node.right != null){
        			queue.add(node.right);
        			level++;
        		}
        	}
        	averages.add(sum/size);
        	size = level;
        }
        
        return averages;
    }
}
