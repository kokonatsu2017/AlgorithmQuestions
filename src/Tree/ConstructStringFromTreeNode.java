package Tree;

/**
 * You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.

The null node needs to be represented by empty parenthesis pair "()". And you need to omit all the empty parenthesis pairs that don't affect 
the one-to-one mapping relationship between the string and the original binary tree.
 * 
 *     1
     /   \
    2     3
   /    
  4     
 * "1(2(4))(3)"
 * 
 * 
 *     1
     /   \
    2     3
     \  
      4 
      
    "1(2()(4))(3)"
 */
public class ConstructStringFromTreeNode {
	
	public String tree2str(TreeNode t){
		String s = "";
		
		if(t == null) return s;
		
		s = s + Integer.toString(t.val);
		
		if(t.left != null){
			s += "(" + tree2str(t.left) +")";
		} else if(t.right != null){
			s += "()";
		}
		
		if(t.right != null){
			s += "(" + tree2str(t.right) +")";
		} 
		
		return s;	
	}

	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
	 
}
