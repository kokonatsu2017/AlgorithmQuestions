package Medium;

import java.util.ArrayList;
import java.util.List;

import lib.TreeNode;
/**
 * LeetCode 655
 * @author kokonatsudream
 *
 */
public class PrintBinaryTree {
	public List<List<String>> printTree(TreeNode root) {
       List<List<String>> res = new ArrayList<>();
       
       int height = getHeight(root);
       int wide = (int) (Math.pow(2, height) - 1);
       
       for(int i = 0; i < height; i++){
    	   List<String> list = new ArrayList<>();
    	   
    	   for(int j = 0; j < wide; j++){
    		   list.add("");
    	   }
    	   res.add(list);
       }
       
       printTree(root, 0, 0, wide, res);
       
       return res;
		
    }
	
	public void printTree(TreeNode n, int level, int left, int right, List<List<String>> res){
		if(n == null) return;
		
		int pos = (left + right) /2;
		
		res.get(level).set(pos, String.valueOf(n.val));
		
		printTree(n.left, level + 1, left, pos, res);
		printTree(n.right, level + 1, pos + 1, right, res);
	}
	
	public int getHeight(TreeNode root){
    	if(root == null) return 0;
    	
    	return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }
}
