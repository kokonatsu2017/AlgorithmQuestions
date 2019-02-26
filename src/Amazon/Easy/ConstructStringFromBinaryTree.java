package Easy;

import lib.TreeNode;

/**
 * LeetCode 606
 * @author kokonatsudream
 *
 */
public class ConstructStringFromBinaryTree {
	public String tree2str(TreeNode t) {
		if(t == null) return "";
		
		StringBuilder s = new StringBuilder();
		
		tree2str(t, s);
		
		return s.toString();
    }
	
	public void tree2str(TreeNode t, StringBuilder sb){
		
		sb.append(t.val);
		
		if(t.left != null){
			sb.append("(");
			tree2str(t.left, sb);
			sb.append(")");
		}
		
		if(t.left == null && t.right != null){
			sb.append("(");
			sb.append(")");
		}
		
		if(t.right != null){
			sb.append("(");
			tree2str(t.right, sb);
			sb.append(")");
		}
	}
}
