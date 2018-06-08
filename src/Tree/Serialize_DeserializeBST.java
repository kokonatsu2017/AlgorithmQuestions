package Tree;
/**
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary search tree. There is no restriction on how your serialization/deserialization algorithm should work. You just need to ensure that a binary search tree can be serialized to a string and this string can be deserialized to the original tree structure.

The encoded string should be as compact as possible.
 * @author kokonatsudream
 *
 */
public class Serialize_DeserializeBST {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}
	
	public static final String separator = ",";
	
	// Encodes a tree to a single string.
    public String serialize(TreeNode root) {
    	
        if(root == null) return "";
        
        StringBuilder res = new StringBuilder();
        
        res.append(root.val);
        
        serialize(res, root.left);
        serialize(res, root.right);
        
        return res.toString();
    }

    private void serialize(StringBuilder res, TreeNode n) {
    	if(n == null) return;
    	
    	res.append(separator + n.val);
    	serialize(res, n.left);
    	serialize(res, n.right);
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
    	
        if(data.isEmpty()) return null;
        
        String[] datas = data.split(separator);
        int[] vals = new int[datas.length];
        
        for(int i = 0; i < datas.length; i++) {
        	vals[i] = Integer.parseInt(datas[i]);
        }
        
        return deserialize(vals, 0, vals.length - 1);
    }
    
    private TreeNode deserialize(int[] data, int start, int end) {
    	
    	if(start > end) return null;
    	
    	if(start == end || start == data.length - 1) {
    		return new TreeNode(data[start]);
    	}
    	
    	int right_child = start + 1;
    	
    	while(right_child < data.length  && data[right_child] < data[start]) right_child++;
    	
    	TreeNode root = new TreeNode(data[start]);
    	
    	root.left = deserialize(data, start + 1, right_child - 1);
    	root.right = deserialize(data, right_child, end);
    	
    	return root;
    	
    }
}
