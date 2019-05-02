package Medium;

import java.util.ArrayList;
import java.util.List;

import lib.TreeNode;
/**
 * LeetCode 894
 * @author kokonatsudream
 *
 */
public class allPossibleFullBinaryTree {
	public List<TreeNode> allPossibleFBT(int N) {
        if(N < 0 || N % 2 == 0){
        	return new ArrayList<>();
        }
        
        List<TreeNode> res = new ArrayList<>();
        if(N == 1){
        	TreeNode n = new TreeNode(0);
        	res.add(n);
        	return res;
        }
        
        for(int i = 1; i < N; i+=2){ 
        	List<TreeNode> leftSubTree = allPossibleFBT(i);
        	List<TreeNode> rightSubTree = allPossibleFBT(N - i - 1);
        	
        	for(TreeNode left : leftSubTree){
        		for(TreeNode right: rightSubTree){
        			TreeNode n = new TreeNode(0);
        			n.left = left;
        			n.right = right;
        			
        			res.add(n);
        			
        		}
        	}
        }
        
        return res;
    } 
}
