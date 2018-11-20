package Amazon;

import lib.TreeNode;
/**
 * LeetCode 449
 * @author kokonatsudream
 *
 */
public class SerializeDeserializeBST {
	// Encodes a tree to a single string.
	String separator =",";
    public String serialize(TreeNode root) {
    	StringBuilder res = new StringBuilder();
    	
    	serialize(res, root);
    	
        return res.toString();
    }
    
    private void serialize(StringBuilder sb, TreeNode node){
    	if(node == null) return;
    	
    	sb.append(node.val + separator);
    	
    	serialize(sb, node.left);
    	serialize(sb, node.right);
	}

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty()) return null;
        
        String[] words = data.split(",");
        int[] values = new int[words.length];
        
        for(int i = 0; i < values.length; i++){
        	values[i] = Integer.parseInt(words[i]);
        }
        
        return deserialize(values, 0, values.length - 1);
    }
    
    private TreeNode deserialize(int[] values, int start, int end){
    	if(start > end) return null;
    	
    	if(start == end || start == values.length - 1){
    		return new TreeNode(values[start]);
    	}
    	
    	int right_index = start + 1;
    	
    	while(right_index < values.length && values[right_index] < values[start]) right_index++;
    	
    	TreeNode node = new TreeNode(values[start]);
    	
    	node.left = deserialize(values, start + 1, right_index - 1);
    	node.right = deserialize(values, right_index, end);
    	
    	return node;
    	
    }
}
